package com.se.classmategalaxy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author wyx20
 * @version 1.0
 * @title planet
 * @description
 * @create 2023/12/25 19:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Planet {
    @TableId(type= IdType.AUTO)
    private Integer planetId;
    private String planetName;
    private Integer memberNum;
    private Timestamp createTime;
    private String description;
    private String picture;
    private Integer ownerId;
    private String planetTags;

    @TableField(exist = false)
    private List<String> tagList;

    @TableField(exist = false)
    private String briefIntroduction;
}
