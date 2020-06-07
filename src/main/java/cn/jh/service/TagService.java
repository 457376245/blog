package cn.jh.service;

import cn.jh.pojo.Tag;

import java.util.List;

public interface TagService {
    int saveTag(Tag tag);

    int deleteTag(Long id);

    int updateTag(Tag tag);

    Tag getById(Long id);

    Tag getByName(String name);

    List<Tag> getAllTag();

    List<Tag> getTagByString(String text);

    List<Tag> getAdminTag();
}
