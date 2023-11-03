package com.homura.bean.importtest;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class TestImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("TestImportSelector.selectImports:" + importingClassMetadata);
        return new String[]{TestBeanC.class.getName()};
    }

}


class TestBeanC {
}
