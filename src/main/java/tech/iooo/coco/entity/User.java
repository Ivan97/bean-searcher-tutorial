package tech.iooo.coco.entity;

import com.ejlchina.searcher.bean.DbField;
import com.ejlchina.searcher.bean.SearchBean;
import lombok.Data;

/**
 * @author 龙也
 * @date 2022/10/27 10:39 AM
 */
@SearchBean(
    tables = "public.user u,public.role r",
    where = "u.role_id = r.id"
)
@Data
public class User {

    @DbField("u.id")
    private Long id;

    @DbField("u.name")
    private String username;

    @DbField("r.name")
    private String role;
}
