package test.parser;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 水果供应商注解
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitProvider {
    /**
     * 供应商编号
     * @return
     */
    int id() default -1;

    /**
     * 供应商名称
     * @return
     */
    String name() default " ";

    /**
     * 供应商地址
     * @return
     */
    String address() default " ";
}
