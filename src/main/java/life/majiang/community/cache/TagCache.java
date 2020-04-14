package life.majiang.community.cache;

import life.majiang.community.dto.TagDTO;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zxh
 * @version 1.0
 * @date 2020/4/13 17:45
 */
public class TagCache {

    public static List<TagDTO> get() {
        List<TagDTO> tagDTOS = new ArrayList<>();
        TagDTO program = new TagDTO();
        program.setCategoryName("开发语言");
        program.setTags(Arrays.asList("javascript", "java", "php", "html", "css", "node.js", "python", "C", "C++", "C#"));
        tagDTOS.add(program);

        TagDTO framework = new TagDTO();
        framework.setCategoryName("平台架构");
        framework.setTags(Arrays.asList("Spring", "Spring Boot", "yii", "vue", "thinkPHP", "laravel"));
        tagDTOS.add(framework);

        TagDTO server = new TagDTO();
        server.setCategoryName("服务器");
        server.setTags(Arrays.asList("Linux", "nginx", "docker", "apache", "tomcat"));
        tagDTOS.add(server);

        TagDTO db = new TagDTO();
        db.setCategoryName("数据库");
        db.setTags(Arrays.asList("mysql", "redis", "oracle", "nosql", "postgresql", "memcache", "mongodb", "mysql", "redis", "oracle", "nosql", "postgresql", "memcache", "mongodb", "mysql", "redis", "oracle", "nosql", "postgresql", "memcache", "mongodb"));
        tagDTOS.add(db);

        TagDTO tool = new TagDTO();
        tool.setCategoryName("开发工具");
        tool.setTags(Arrays.asList("git", "github", "svn", "maven", "idea", "eclipse"));
        tagDTOS.add(tool);
        return tagDTOS;
    }

    public static String filterInvaild(String tags) {
        String[] split = StringUtils.split(tags, ',');
        List<TagDTO> tagDTOS = get();
        //flatMap把二维数组的层拿出
        List<String> tagList = tagDTOS.stream().flatMap(tag -> tag.getTags().stream()).collect(Collectors.toList());
        String invaild = Arrays.stream(split).filter(t -> !tagList.contains(t)).collect(Collectors.joining(","));
        return invaild;
    }
}
