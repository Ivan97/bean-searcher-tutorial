package tech.iooo.coco.service;

import java.util.Collections;

import com.ejlchina.searcher.BeanSearcher;
import com.ejlchina.searcher.SearchResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tech.iooo.coco.entity.User;

/**
 * @author 龙也
 * @date 2022/10/27 2:44 PM
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final BeanSearcher searcher;

    public SearchResult<User> users() {
        return searcher.search(User.class, Collections.emptyMap());
    }
}
