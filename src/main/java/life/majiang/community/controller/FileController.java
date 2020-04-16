package life.majiang.community.controller;

import life.majiang.community.dto.FileDTO;
import life.majiang.community.exception.CustomizeErrorCode;
import life.majiang.community.exception.CustomizeException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author zxh
 * @version 1.0
 * @date 2020/4/15 16:23
 */
@Controller
public class FileController {

    /**
     * 项目根路径下的目录  -- SpringBoot static 目录相当于是根路径下（SpringBoot 默认）
     */
    public final static String UPLOAD_PATH_PREFIX = "static/upload/";

    @ResponseBody
    @RequestMapping("/file/upload")
    public FileDTO upload(@RequestParam("editormd-image-file") MultipartFile uploadFile) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/");
        //构建文件上传所要保存的"文件夹路径"--这里是相对路径，保存到项目根路径的文件夹下
        String realPath = "src/main/resources/" + UPLOAD_PATH_PREFIX;
        //存放上传文件的文件夹
        String format = sdf.format(new Date());
        File file = new File(realPath + format);
        if (!file.isDirectory()) {
            //递归生成文件夹
            file.mkdirs();
        }
        //获取原始的名字  original:最初的，起始的  方法是得到原来的文件名在客户机的文件系统名称
        String oldName = uploadFile.getOriginalFilename();
        String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."), oldName.length());

        try {
            //构建真实的文件路径
            File newFile = new File(file.getAbsolutePath() + File.separator + newName);
            System.out.println(file.getAbsolutePath());
            System.out.println(File.separator);
            System.out.println(newName);
            System.out.println(file.getAbsolutePath() + File.separator + newName);
            //转存文件到指定路径，如果文件名重复的话，将会覆盖掉之前的文件,这里是把文件上传到 “绝对路径”
            uploadFile.transferTo(newFile);
        } catch (Exception e) {
            throw new CustomizeException(CustomizeErrorCode.FILE_UPLOAD_ERROR);
        }
        FileDTO fileDTO = new FileDTO();
        fileDTO.setSuccess(1);
        fileDTO.setUrl("/upload/" + format + newName);
        return fileDTO;
    }
}
