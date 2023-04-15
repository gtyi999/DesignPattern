package com.company.VisitorPattern;


//ComputerPart接口定义了接受操作，它以ComputerPartVisitor作为参数。
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
