package com.kk.pattern.builder;

/**
 * @author kian
 * @date 2019/10/24
 */
public class BuilderMain {
    public static void main(String[] args) {
        Builder builder1= new ConcreteBuilderA();
        Builder builder2 = new ConcreteBuilderB();
        BuilderDirector builderDirector = new BuilderDirector(builder1);
        builderDirector.build();

        BuilderDirector builderDirector2 = new BuilderDirector(builder2);
        builderDirector2.build();

    }
}
