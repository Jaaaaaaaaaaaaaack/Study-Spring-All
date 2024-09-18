package com.wcw.jdbctemplate.mapper;

import com.wcw.jdbctemplate.domain.Student;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

/**
 * @author wu
 * @create 2024/9/13 17:44
 */
public class StudentMapper implements RowMapper{
    @Override
    public int[] getRowsForPaths(TreePath[] path) {

        return new int[0];
    }
}
