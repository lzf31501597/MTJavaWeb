package com.baomidou.entity;

import java.math.BigDecimal;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2024-05-29
 */
public class Salgrade implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer grade;

    private BigDecimal losal;

    private BigDecimal hisal;


    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public BigDecimal getLosal() {
        return losal;
    }

    public void setLosal(BigDecimal losal) {
        this.losal = losal;
    }

    public BigDecimal getHisal() {
        return hisal;
    }

    public void setHisal(BigDecimal hisal) {
        this.hisal = hisal;
    }

    @Override
    public String toString() {
        return "Salgrade{" +
        "grade=" + grade +
        ", losal=" + losal +
        ", hisal=" + hisal +
        "}";
    }
}
