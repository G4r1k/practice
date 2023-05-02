package ru.neoflex.practice.model;

import javax.persistence.*;

@Entity
@Table(name = "CalcData")
public class simpleCalcData
{
    private long id;
    private double A;
    private double B;
    private String method;
    private double result;

    public  simpleCalcData(){}

    public simpleCalcData(double a,String method,double b,double result)
    {
        A=a;
        this.method = method;
        B=b;
        this.result = result;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId(){
        return  id;
    }

    public  void setId(long id)
    {
        this.id = id;
    }

    @Column(name = "first_number", nullable = false)
    public double getFirstNumber() {
        return A;
    }
    public void setFirstNumber(double A) {
        this.A = A;
    }
    @Column(name ="method",nullable = false)
    public String getMethod()
    {
        return method;
    }

    public void setMethod(String method)
    {
        this.method = method;
    }

    @Column(name = "second_number", nullable = false)
    public double getSecondNumber() {
        return B;
    }
    public void setSecondNumber(double B) {
        this.B = B;
    }

    @Column(name ="result",nullable = false)
    public double getResult()
    {
        return result;
    }

    public void setResult(double result)
    {
        this.result = result;
    }
}
