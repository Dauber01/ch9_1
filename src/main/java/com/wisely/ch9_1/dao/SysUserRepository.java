package com.wisely.ch9_1.dao;

import com.wisely.ch9_1.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 数据访问层
 * @author Lucifer
 * @date 2018/02/28 14:51
 */
public interface SysUserRepository extends JpaRepository<SysUser,Long>{

    SysUser findByUsername(String username);

}
