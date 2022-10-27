package tech.iooo.coco.runner;

import java.util.Map;

import cn.hutool.json.JSONUtil;
import com.ejlchina.searcher.BeanSearcher;
import com.ejlchina.searcher.SearchResult;
import com.ejlchina.searcher.util.MapUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tech.iooo.coco.entity.User;

/**
 * @author 龙也
 * @date 2022/10/27 11:53 AM
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class SearchRunner implements CommandLineRunner {

    private final BeanSearcher searcher;

    @Override
    public void run(String... args) throws Exception {

        Map<String, Object> params = MapUtils.builder()
            .build();
        SearchResult<User> result = searcher.search(User.class, params);
        log.info("{}", JSONUtil.toJsonStr(result));
    }
}
