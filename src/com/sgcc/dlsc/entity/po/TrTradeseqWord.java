package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrTradeseqWord的POJO类
 *
 * @author  Barca  [Thu Sep 26 17:41:07 CST 2013]
 * 
 */
public class TrTradeseqWord implements Serializable{

    /** 
     * 属性jyxl
     */
    private String jyxl;
	
    /** 
     * 属性dw1
     */
    private String dw1;
	
    /** 
     * 属性dw1bm1
     */
    private String dw1bm1;
	
    /** 
     * 属性dw1bm2
     */
    private String dw1bm2;
	
    /** 
     * 属性dw1bm3
     */
    private String dw1bm3;
	
    /** 
     * 属性dw2
     */
    private String dw2;
	
    /** 
     * 属性dw2bm1
     */
    private String dw2bm1;
	
    /** 
     * 属性dw2bm2
     */
    private String dw2bm2;
	
    /** 
     * 属性dw2bm3
     */
    private String dw2bm3;
	
    /** 
     * 属性dw3
     */
    private String dw3;
	
    /** 
     * 属性dw3bm1
     */
    private String dw3bm1;
	
    /** 
     * 属性dw3bm2
     */
    private String dw3bm2;
	
    /** 
     * 属性dw3bm3
     */
    private String dw3bm3;
	
    /** 
     * 属性dw4
     */
    private String dw4;
	
    /** 
     * 属性dw4bm1
     */
    private String dw4bm1;
	
    /** 
     * 属性dw4bm2
     */
    private String dw4bm2;
	
    /** 
     * 属性dw4bm3
     */
    private String dw4bm3;
	
    /** 
     * 属性dw5
     */
    private String dw5;
	
    /** 
     * 属性dw5bm1
     */
    private String dw5bm1;
	
    /** 
     * 属性dw5bm2
     */
    private String dw5bm2;
	
    /** 
     * 属性dw5bm3
     */
    private String dw5bm3;
	
    /** 
     * 属性dw6
     */
    private String dw6;
	
    /** 
     * 属性dw6bm1
     */
    private String dw6bm1;
	
    /** 
     * 属性dw6bm2
     */
    private String dw6bm2;
	
    /** 
     * 属性dw6bm3
     */
    private String dw6bm3;
	
    /** 
     * 属性dw7
     */
    private String dw7;
	
    /** 
     * 属性dw7bm1
     */
    private String dw7bm1;
	
    /** 
     * 属性dw7bm2
     */
    private String dw7bm2;
	
    /** 
     * 属性dw7bm3
     */
    private String dw7bm3;
	
    /** 
     * 属性dw8
     */
    private String dw8;
	
    /** 
     * 属性dw8bm1
     */
    private String dw8bm1;
	
    /** 
     * 属性dw8bm2
     */
    private String dw8bm2;
	
    /** 
     * 属性dw8bm3
     */
    private String dw8bm3;
	
    /** 
     * 属性bt
     */
    private String bt;
	
    /** 
     * 属性dwhz
     */
    private String dwhz;
	
    /** 
     * 属性jysm
     */
    private String jysm;
	
    /** 
     * 属性sdf
     */
    private String sdf;
	
    /** 
     * 属性gdf
     */
    private String gdf;
	
    /** 
     * 属性sddw
     */
    private String sddw;
	
    /** 
     * 属性jysj
     */
    private String jysj;
	
    /** 
     * 属性jydli
     */
    private String jydli;
	
    /** 
     * 属性jydl
     */
    private String jydl;
	
    /** 
     * 属性jytd
     */
    private String jytd;
	
    /** 
     * 属性jygk
     */
    private String jygk;
	
    /** 
     * 属性jydj
     */
    private String jydj;
	
    /** 
     * 属性djmx
     */
    private String djmx;
	
    /** 
     * 属性jymc
     */
    private String jymc;
	
    /** 
     * 属性jydh
     */
    private String jydh;
	
    /**
     * TrTradeseqWord构造函数
     */
    public TrTradeseqWord() {
        super();
    }  
	
    /**
     * TrTradeseqWord完整的构造函数
     */  
    public TrTradeseqWord(String jyxl){
        this.jyxl = jyxl;
    }
 
    /**
     * 属性 jyxl 的get方法
     * @return String
     */
    public String getJyxl(){
        return jyxl;
    }
	
    /**
     * 属性 jyxl 的set方法
     * @return
     */
    public void setJyxl(String jyxl){
        if(jyxl != null && jyxl.trim().length() == 0){
            this.jyxl = null;
        }else{
            this.jyxl = jyxl;
        }
    } 
	
    /**
     * 属性 dw1 的get方法
     * @return String
     */
    public String getDw1(){
        return dw1;
    }
	
    /**
     * 属性 dw1 的set方法
     * @return
     */
    public void setDw1(String dw1){
        this.dw1 = dw1;
    } 
	
    /**
     * 属性 dw1bm1 的get方法
     * @return String
     */
    public String getDw1bm1(){
        return dw1bm1;
    }
	
    /**
     * 属性 dw1bm1 的set方法
     * @return
     */
    public void setDw1bm1(String dw1bm1){
        this.dw1bm1 = dw1bm1;
    } 
	
    /**
     * 属性 dw1bm2 的get方法
     * @return String
     */
    public String getDw1bm2(){
        return dw1bm2;
    }
	
    /**
     * 属性 dw1bm2 的set方法
     * @return
     */
    public void setDw1bm2(String dw1bm2){
        this.dw1bm2 = dw1bm2;
    } 
	
    /**
     * 属性 dw1bm3 的get方法
     * @return String
     */
    public String getDw1bm3(){
        return dw1bm3;
    }
	
    /**
     * 属性 dw1bm3 的set方法
     * @return
     */
    public void setDw1bm3(String dw1bm3){
        this.dw1bm3 = dw1bm3;
    } 
	
    /**
     * 属性 dw2 的get方法
     * @return String
     */
    public String getDw2(){
        return dw2;
    }
	
    /**
     * 属性 dw2 的set方法
     * @return
     */
    public void setDw2(String dw2){
        this.dw2 = dw2;
    } 
	
    /**
     * 属性 dw2bm1 的get方法
     * @return String
     */
    public String getDw2bm1(){
        return dw2bm1;
    }
	
    /**
     * 属性 dw2bm1 的set方法
     * @return
     */
    public void setDw2bm1(String dw2bm1){
        this.dw2bm1 = dw2bm1;
    } 
	
    /**
     * 属性 dw2bm2 的get方法
     * @return String
     */
    public String getDw2bm2(){
        return dw2bm2;
    }
	
    /**
     * 属性 dw2bm2 的set方法
     * @return
     */
    public void setDw2bm2(String dw2bm2){
        this.dw2bm2 = dw2bm2;
    } 
	
    /**
     * 属性 dw2bm3 的get方法
     * @return String
     */
    public String getDw2bm3(){
        return dw2bm3;
    }
	
    /**
     * 属性 dw2bm3 的set方法
     * @return
     */
    public void setDw2bm3(String dw2bm3){
        this.dw2bm3 = dw2bm3;
    } 
	
    /**
     * 属性 dw3 的get方法
     * @return String
     */
    public String getDw3(){
        return dw3;
    }
	
    /**
     * 属性 dw3 的set方法
     * @return
     */
    public void setDw3(String dw3){
        this.dw3 = dw3;
    } 
	
    /**
     * 属性 dw3bm1 的get方法
     * @return String
     */
    public String getDw3bm1(){
        return dw3bm1;
    }
	
    /**
     * 属性 dw3bm1 的set方法
     * @return
     */
    public void setDw3bm1(String dw3bm1){
        this.dw3bm1 = dw3bm1;
    } 
	
    /**
     * 属性 dw3bm2 的get方法
     * @return String
     */
    public String getDw3bm2(){
        return dw3bm2;
    }
	
    /**
     * 属性 dw3bm2 的set方法
     * @return
     */
    public void setDw3bm2(String dw3bm2){
        this.dw3bm2 = dw3bm2;
    } 
	
    /**
     * 属性 dw3bm3 的get方法
     * @return String
     */
    public String getDw3bm3(){
        return dw3bm3;
    }
	
    /**
     * 属性 dw3bm3 的set方法
     * @return
     */
    public void setDw3bm3(String dw3bm3){
        this.dw3bm3 = dw3bm3;
    } 
	
    /**
     * 属性 dw4 的get方法
     * @return String
     */
    public String getDw4(){
        return dw4;
    }
	
    /**
     * 属性 dw4 的set方法
     * @return
     */
    public void setDw4(String dw4){
        this.dw4 = dw4;
    } 
	
    /**
     * 属性 dw4bm1 的get方法
     * @return String
     */
    public String getDw4bm1(){
        return dw4bm1;
    }
	
    /**
     * 属性 dw4bm1 的set方法
     * @return
     */
    public void setDw4bm1(String dw4bm1){
        this.dw4bm1 = dw4bm1;
    } 
	
    /**
     * 属性 dw4bm2 的get方法
     * @return String
     */
    public String getDw4bm2(){
        return dw4bm2;
    }
	
    /**
     * 属性 dw4bm2 的set方法
     * @return
     */
    public void setDw4bm2(String dw4bm2){
        this.dw4bm2 = dw4bm2;
    } 
	
    /**
     * 属性 dw4bm3 的get方法
     * @return String
     */
    public String getDw4bm3(){
        return dw4bm3;
    }
	
    /**
     * 属性 dw4bm3 的set方法
     * @return
     */
    public void setDw4bm3(String dw4bm3){
        this.dw4bm3 = dw4bm3;
    } 
	
    /**
     * 属性 dw5 的get方法
     * @return String
     */
    public String getDw5(){
        return dw5;
    }
	
    /**
     * 属性 dw5 的set方法
     * @return
     */
    public void setDw5(String dw5){
        this.dw5 = dw5;
    } 
	
    /**
     * 属性 dw5bm1 的get方法
     * @return String
     */
    public String getDw5bm1(){
        return dw5bm1;
    }
	
    /**
     * 属性 dw5bm1 的set方法
     * @return
     */
    public void setDw5bm1(String dw5bm1){
        this.dw5bm1 = dw5bm1;
    } 
	
    /**
     * 属性 dw5bm2 的get方法
     * @return String
     */
    public String getDw5bm2(){
        return dw5bm2;
    }
	
    /**
     * 属性 dw5bm2 的set方法
     * @return
     */
    public void setDw5bm2(String dw5bm2){
        this.dw5bm2 = dw5bm2;
    } 
	
    /**
     * 属性 dw5bm3 的get方法
     * @return String
     */
    public String getDw5bm3(){
        return dw5bm3;
    }
	
    /**
     * 属性 dw5bm3 的set方法
     * @return
     */
    public void setDw5bm3(String dw5bm3){
        this.dw5bm3 = dw5bm3;
    } 
	
    /**
     * 属性 dw6 的get方法
     * @return String
     */
    public String getDw6(){
        return dw6;
    }
	
    /**
     * 属性 dw6 的set方法
     * @return
     */
    public void setDw6(String dw6){
        this.dw6 = dw6;
    } 
	
    /**
     * 属性 dw6bm1 的get方法
     * @return String
     */
    public String getDw6bm1(){
        return dw6bm1;
    }
	
    /**
     * 属性 dw6bm1 的set方法
     * @return
     */
    public void setDw6bm1(String dw6bm1){
        this.dw6bm1 = dw6bm1;
    } 
	
    /**
     * 属性 dw6bm2 的get方法
     * @return String
     */
    public String getDw6bm2(){
        return dw6bm2;
    }
	
    /**
     * 属性 dw6bm2 的set方法
     * @return
     */
    public void setDw6bm2(String dw6bm2){
        this.dw6bm2 = dw6bm2;
    } 
	
    /**
     * 属性 dw6bm3 的get方法
     * @return String
     */
    public String getDw6bm3(){
        return dw6bm3;
    }
	
    /**
     * 属性 dw6bm3 的set方法
     * @return
     */
    public void setDw6bm3(String dw6bm3){
        this.dw6bm3 = dw6bm3;
    } 
	
    /**
     * 属性 dw7 的get方法
     * @return String
     */
    public String getDw7(){
        return dw7;
    }
	
    /**
     * 属性 dw7 的set方法
     * @return
     */
    public void setDw7(String dw7){
        this.dw7 = dw7;
    } 
	
    /**
     * 属性 dw7bm1 的get方法
     * @return String
     */
    public String getDw7bm1(){
        return dw7bm1;
    }
	
    /**
     * 属性 dw7bm1 的set方法
     * @return
     */
    public void setDw7bm1(String dw7bm1){
        this.dw7bm1 = dw7bm1;
    } 
	
    /**
     * 属性 dw7bm2 的get方法
     * @return String
     */
    public String getDw7bm2(){
        return dw7bm2;
    }
	
    /**
     * 属性 dw7bm2 的set方法
     * @return
     */
    public void setDw7bm2(String dw7bm2){
        this.dw7bm2 = dw7bm2;
    } 
	
    /**
     * 属性 dw7bm3 的get方法
     * @return String
     */
    public String getDw7bm3(){
        return dw7bm3;
    }
	
    /**
     * 属性 dw7bm3 的set方法
     * @return
     */
    public void setDw7bm3(String dw7bm3){
        this.dw7bm3 = dw7bm3;
    } 
	
    /**
     * 属性 dw8 的get方法
     * @return String
     */
    public String getDw8(){
        return dw8;
    }
	
    /**
     * 属性 dw8 的set方法
     * @return
     */
    public void setDw8(String dw8){
        this.dw8 = dw8;
    } 
	
    /**
     * 属性 dw8bm1 的get方法
     * @return String
     */
    public String getDw8bm1(){
        return dw8bm1;
    }
	
    /**
     * 属性 dw8bm1 的set方法
     * @return
     */
    public void setDw8bm1(String dw8bm1){
        this.dw8bm1 = dw8bm1;
    } 
	
    /**
     * 属性 dw8bm2 的get方法
     * @return String
     */
    public String getDw8bm2(){
        return dw8bm2;
    }
	
    /**
     * 属性 dw8bm2 的set方法
     * @return
     */
    public void setDw8bm2(String dw8bm2){
        this.dw8bm2 = dw8bm2;
    } 
	
    /**
     * 属性 dw8bm3 的get方法
     * @return String
     */
    public String getDw8bm3(){
        return dw8bm3;
    }
	
    /**
     * 属性 dw8bm3 的set方法
     * @return
     */
    public void setDw8bm3(String dw8bm3){
        this.dw8bm3 = dw8bm3;
    } 
	
    /**
     * 属性 bt 的get方法
     * @return String
     */
    public String getBt(){
        return bt;
    }
	
    /**
     * 属性 bt 的set方法
     * @return
     */
    public void setBt(String bt){
        this.bt = bt;
    } 
	
    /**
     * 属性 dwhz 的get方法
     * @return String
     */
    public String getDwhz(){
        return dwhz;
    }
	
    /**
     * 属性 dwhz 的set方法
     * @return
     */
    public void setDwhz(String dwhz){
        this.dwhz = dwhz;
    } 
	
    /**
     * 属性 jysm 的get方法
     * @return String
     */
    public String getJysm(){
        return jysm;
    }
	
    /**
     * 属性 jysm 的set方法
     * @return
     */
    public void setJysm(String jysm){
        this.jysm = jysm;
    } 
	
    /**
     * 属性 sdf 的get方法
     * @return String
     */
    public String getSdf(){
        return sdf;
    }
	
    /**
     * 属性 sdf 的set方法
     * @return
     */
    public void setSdf(String sdf){
        this.sdf = sdf;
    } 
	
    /**
     * 属性 gdf 的get方法
     * @return String
     */
    public String getGdf(){
        return gdf;
    }
	
    /**
     * 属性 gdf 的set方法
     * @return
     */
    public void setGdf(String gdf){
        this.gdf = gdf;
    } 
	
    /**
     * 属性 sddw 的get方法
     * @return String
     */
    public String getSddw(){
        return sddw;
    }
	
    /**
     * 属性 sddw 的set方法
     * @return
     */
    public void setSddw(String sddw){
        this.sddw = sddw;
    } 
	
    /**
     * 属性 jysj 的get方法
     * @return String
     */
    public String getJysj(){
        return jysj;
    }
	
    /**
     * 属性 jysj 的set方法
     * @return
     */
    public void setJysj(String jysj){
        this.jysj = jysj;
    } 
	
    /**
     * 属性 jydli 的get方法
     * @return String
     */
    public String getJydli(){
        return jydli;
    }
	
    /**
     * 属性 jydli 的set方法
     * @return
     */
    public void setJydli(String jydli){
        this.jydli = jydli;
    } 
	
    /**
     * 属性 jydl 的get方法
     * @return String
     */
    public String getJydl(){
        return jydl;
    }
	
    /**
     * 属性 jydl 的set方法
     * @return
     */
    public void setJydl(String jydl){
        this.jydl = jydl;
    } 
	
    /**
     * 属性 jytd 的get方法
     * @return String
     */
    public String getJytd(){
        return jytd;
    }
	
    /**
     * 属性 jytd 的set方法
     * @return
     */
    public void setJytd(String jytd){
        this.jytd = jytd;
    } 
	
    /**
     * 属性 jygk 的get方法
     * @return String
     */
    public String getJygk(){
        return jygk;
    }
	
    /**
     * 属性 jygk 的set方法
     * @return
     */
    public void setJygk(String jygk){
        this.jygk = jygk;
    } 
	
    /**
     * 属性 jydj 的get方法
     * @return String
     */
    public String getJydj(){
        return jydj;
    }
	
    /**
     * 属性 jydj 的set方法
     * @return
     */
    public void setJydj(String jydj){
        this.jydj = jydj;
    } 
	
    /**
     * 属性 djmx 的get方法
     * @return String
     */
    public String getDjmx(){
        return djmx;
    }
	
    /**
     * 属性 djmx 的set方法
     * @return
     */
    public void setDjmx(String djmx){
        this.djmx = djmx;
    } 
	
    /**
     * 属性 jymc 的get方法
     * @return String
     */
    public String getJymc(){
        return jymc;
    }
	
    /**
     * 属性 jymc 的set方法
     * @return
     */
    public void setJymc(String jymc){
        this.jymc = jymc;
    } 
	
    /**
     * 属性 jydh 的get方法
     * @return String
     */
    public String getJydh(){
        return jydh;
    }
	
    /**
     * 属性 jydh 的set方法
     * @return
     */
    public void setJydh(String jydh){
        this.jydh = jydh;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrTradeseqWord))
	        return false; 
			
        if(getJyxl() == null) 
	        return false;

        TrTradeseqWord other = (TrTradeseqWord) o;	        
	    return new EqualsBuilder()
            .append(this.getJyxl(), other.getJyxl())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("jyxl"+":"+getJyxl())
            .append("dw1"+":"+getDw1())
            .append("dw1bm1"+":"+getDw1bm1())
            .append("dw1bm2"+":"+getDw1bm2())
            .append("dw1bm3"+":"+getDw1bm3())
            .append("dw2"+":"+getDw2())
            .append("dw2bm1"+":"+getDw2bm1())
            .append("dw2bm2"+":"+getDw2bm2())
            .append("dw2bm3"+":"+getDw2bm3())
            .append("dw3"+":"+getDw3())
            .append("dw3bm1"+":"+getDw3bm1())
            .append("dw3bm2"+":"+getDw3bm2())
            .append("dw3bm3"+":"+getDw3bm3())
            .append("dw4"+":"+getDw4())
            .append("dw4bm1"+":"+getDw4bm1())
            .append("dw4bm2"+":"+getDw4bm2())
            .append("dw4bm3"+":"+getDw4bm3())
            .append("dw5"+":"+getDw5())
            .append("dw5bm1"+":"+getDw5bm1())
            .append("dw5bm2"+":"+getDw5bm2())
            .append("dw5bm3"+":"+getDw5bm3())
            .append("dw6"+":"+getDw6())
            .append("dw6bm1"+":"+getDw6bm1())
            .append("dw6bm2"+":"+getDw6bm2())
            .append("dw6bm3"+":"+getDw6bm3())
            .append("dw7"+":"+getDw7())
            .append("dw7bm1"+":"+getDw7bm1())
            .append("dw7bm2"+":"+getDw7bm2())
            .append("dw7bm3"+":"+getDw7bm3())
            .append("dw8"+":"+getDw8())
            .append("dw8bm1"+":"+getDw8bm1())
            .append("dw8bm2"+":"+getDw8bm2())
            .append("dw8bm3"+":"+getDw8bm3())
            .append("bt"+":"+getBt())
            .append("dwhz"+":"+getDwhz())
            .append("jysm"+":"+getJysm())
            .append("sdf"+":"+getSdf())
            .append("gdf"+":"+getGdf())
            .append("sddw"+":"+getSddw())
            .append("jysj"+":"+getJysj())
            .append("jydli"+":"+getJydli())
            .append("jydl"+":"+getJydl())
            .append("jytd"+":"+getJytd())
            .append("jygk"+":"+getJygk())
            .append("jydj"+":"+getJydj())
            .append("djmx"+":"+getDjmx())
            .append("jymc"+":"+getJymc())
            .append("jydh"+":"+getJydh())
            .toString(); 
			
    } 
   

    /**
     * hashcode方法
     * @return int
     * 
     */
    @Override
    public int hashCode(){
		return super.hashCode();
	}

}