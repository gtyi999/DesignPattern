package com.company.FilterPattern;

import java.util.List;

// This is the interface that all criteria标准  classes will implement
//为标准（Criteria）创建一个接口。
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);

}
