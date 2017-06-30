package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PubTmFdqjywcqktj的POJO类
 *
 * @author  admin  [Mon Jun 09 13:11:48 CST 2014]
 * 
 */
public class PubTmFdqjywcqktj implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性tyear
     */
    private BigDecimal tyear;
	
    /** 
     * 属性tmonth
     */
    private BigDecimal tmonth;
	
    /** 
     * 属性markerid
     */
    private String markerid;
	
    /** 
     * 属性bygttdzbdl
     */
    private BigDecimal bygttdzbdl;
	
    /** 
     * 属性bygttdzjrl
     */
    private BigDecimal bygttdzjrl;
	
    /** 
     * 属性bygttdwcdl
     */
    private BigDecimal bygttdwcdl;
	
    /** 
     * 属性byzytdwcdl
     */
    private BigDecimal byzytdwcdl;
	
    /** 
     * 属性bywcdl
     */
    private BigDecimal bywcdl;
	
    /** 
     * 属性bywcdltq
     */
    private BigDecimal bywcdltq;
	
    /** 
     * 属性bywcjybm
     */
    private BigDecimal bywcjybm;
	
    /** 
     * 属性bywcjpso2
     */
    private BigDecimal bywcjpso2;
	
    /** 
     * 属性bywcjpco2
     */
    private BigDecimal bywcjpco2;
	
    /** 
     * 属性ndgttdzbdl
     */
    private String ndgttdzbdl;
	
    /** 
     * 属性ljgttdzjrl
     */
    private BigDecimal ljgttdzjrl;
	
    /** 
     * 属性ljgttdwcdl
     */
    private BigDecimal ljgttdwcdl;
	
    /** 
     * 属性ljzytdwcdl
     */
    private BigDecimal ljzytdwcdl;
	
    /** 
     * 属性ljwcdl
     */
    private BigDecimal ljwcdl;
	
    /** 
     * 属性ljwcdltq
     */
    private BigDecimal ljwcdltq;
	
    /** 
     * 属性ljwcjybm
     */
    private BigDecimal ljwcjybm;
	
    /** 
     * 属性ljwcjpso2
     */
    private BigDecimal ljwcjpso2;
	
    /** 
     * 属性ljwcjpco2
     */
    private BigDecimal ljwcjpco2;
	
    /** 
     * 属性sjversion
     */
    private String sjversion;
	
    /** 
     * 属性xh
     */
    private BigDecimal xh;
	
    /** 
     * 属性state
     */
    private BigDecimal state;
	
    /** 
     * 属性subjectguid
     */
    private String subjectguid;
	
    /** 
     * 属性fillinman
     */
    private String fillinman;
	
    /** 
     * 属性fillintime
     */
    private Date fillintime;
	
    /** 
     * 属性bak1
     */
    private BigDecimal bak1;
	
    /** 
     * 属性bak2
     */
    private BigDecimal bak2;
	
    /** 
     * 属性bak3
     */
    private String bak3;
	
    /** 
     * 属性bak4
     */
    private String bak4;
	
    /** 
     * 属性bak5
     */
    private String bak5;
	
    /** 
     * 属性bak6
     */
    private String bak6;
	
    /** 
     * 属性dydl
     */
    private BigDecimal dydl;
	
    /** 
     * 属性dydltq
     */
    private BigDecimal dydltq;
	
    /** 
     * 属性dyjh
     */
    private BigDecimal dyjh;
	
    /** 
     * 属性dywcl
     */
    private BigDecimal dywcl;
	
    /** 
     * 属性zytddl
     */
    private BigDecimal zytddl;
	
    /** 
     * 属性zytddltq
     */
    private BigDecimal zytddltq;
	
    /** 
     * 属性gttdrltq
     */
    private BigDecimal gttdrltq;
	
    /** 
     * 属性gttddltq
     */
    private BigDecimal gttddltq;
	
    /** 
     * 属性ljgttdxz
     */
    private BigDecimal ljgttdxz;
	
    /** 
     * 属性ljgttdyjdl
     */
    private BigDecimal ljgttdyjdl;
	
    /** 
     * 属性hn
     */
    private BigDecimal hn;
	
    /** 
     * 属性dt
     */
    private BigDecimal dt;
	
    /** 
     * 属性gd
     */
    private BigDecimal gd;
	
    /** 
     * 属性hd
     */
    private BigDecimal hd;
	
    /** 
     * 属性zdt
     */
    private BigDecimal zdt;
	
    /** 
     * 属性gh
     */
    private BigDecimal gh;
	
    /** 
     * 属性qt
     */
    private BigDecimal qt;
	
    /** 
     * 属性ljzytddltq
     */
    private BigDecimal ljzytddltq;
	
    /**
     * PubTmFdqjywcqktj构造函数
     */
    public PubTmFdqjywcqktj() {
        super();
    }  
	
    /**
     * PubTmFdqjywcqktj完整的构造函数
     */  
    public PubTmFdqjywcqktj(String guid,BigDecimal tyear,BigDecimal tmonth,String markerid,BigDecimal state,String fillinman,Date fillintime){
        this.guid = guid;
        this.tyear = tyear;
        this.tmonth = tmonth;
        this.markerid = markerid;
        this.state = state;
        this.fillinman = fillinman;
        this.fillintime = fillintime;
    }
 
    /**
     * 属性 guid 的get方法
     * @return String
     */
    public String getGuid(){
        return guid;
    }
	
    /**
     * 属性 guid 的set方法
     * @return
     */
    public void setGuid(String guid){
        if(guid != null && guid.trim().length() == 0){
            this.guid = null;
        }else{
            this.guid = guid;
        }
    } 
	
    /**
     * 属性 tyear 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTyear(){
        return tyear;
    }
	
    /**
     * 属性 tyear 的set方法
     * @return
     */
    public void setTyear(BigDecimal tyear){
        this.tyear = tyear;
    } 
	
    /**
     * 属性 tmonth 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTmonth(){
        return tmonth;
    }
	
    /**
     * 属性 tmonth 的set方法
     * @return
     */
    public void setTmonth(BigDecimal tmonth){
        this.tmonth = tmonth;
    } 
	
    /**
     * 属性 markerid 的get方法
     * @return String
     */
    public String getMarkerid(){
        return markerid;
    }
	
    /**
     * 属性 markerid 的set方法
     * @return
     */
    public void setMarkerid(String markerid){
        this.markerid = markerid;
    } 
	
    /**
     * 属性 bygttdzbdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBygttdzbdl(){
        return bygttdzbdl;
    }
	
    /**
     * 属性 bygttdzbdl 的set方法
     * @return
     */
    public void setBygttdzbdl(BigDecimal bygttdzbdl){
        this.bygttdzbdl = bygttdzbdl;
    } 
	
    /**
     * 属性 bygttdzjrl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBygttdzjrl(){
        return bygttdzjrl;
    }
	
    /**
     * 属性 bygttdzjrl 的set方法
     * @return
     */
    public void setBygttdzjrl(BigDecimal bygttdzjrl){
        this.bygttdzjrl = bygttdzjrl;
    } 
	
    /**
     * 属性 bygttdwcdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBygttdwcdl(){
        return bygttdwcdl;
    }
	
    /**
     * 属性 bygttdwcdl 的set方法
     * @return
     */
    public void setBygttdwcdl(BigDecimal bygttdwcdl){
        this.bygttdwcdl = bygttdwcdl;
    } 
	
    /**
     * 属性 byzytdwcdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getByzytdwcdl(){
        return byzytdwcdl;
    }
	
    /**
     * 属性 byzytdwcdl 的set方法
     * @return
     */
    public void setByzytdwcdl(BigDecimal byzytdwcdl){
        this.byzytdwcdl = byzytdwcdl;
    } 
	
    /**
     * 属性 bywcdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBywcdl(){
        return bywcdl;
    }
	
    /**
     * 属性 bywcdl 的set方法
     * @return
     */
    public void setBywcdl(BigDecimal bywcdl){
        this.bywcdl = bywcdl;
    } 
	
    /**
     * 属性 bywcdltq 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBywcdltq(){
        return bywcdltq;
    }
	
    /**
     * 属性 bywcdltq 的set方法
     * @return
     */
    public void setBywcdltq(BigDecimal bywcdltq){
        this.bywcdltq = bywcdltq;
    } 
	
    /**
     * 属性 bywcjybm 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBywcjybm(){
        return bywcjybm;
    }
	
    /**
     * 属性 bywcjybm 的set方法
     * @return
     */
    public void setBywcjybm(BigDecimal bywcjybm){
        this.bywcjybm = bywcjybm;
    } 
	
    /**
     * 属性 bywcjpso2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBywcjpso2(){
        return bywcjpso2;
    }
	
    /**
     * 属性 bywcjpso2 的set方法
     * @return
     */
    public void setBywcjpso2(BigDecimal bywcjpso2){
        this.bywcjpso2 = bywcjpso2;
    } 
	
    /**
     * 属性 bywcjpco2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBywcjpco2(){
        return bywcjpco2;
    }
	
    /**
     * 属性 bywcjpco2 的set方法
     * @return
     */
    public void setBywcjpco2(BigDecimal bywcjpco2){
        this.bywcjpco2 = bywcjpco2;
    } 
	
    /**
     * 属性 ndgttdzbdl 的get方法
     * @return String
     */
    public String getNdgttdzbdl(){
        return ndgttdzbdl;
    }
	
    /**
     * 属性 ndgttdzbdl 的set方法
     * @return
     */
    public void setNdgttdzbdl(String ndgttdzbdl){
        this.ndgttdzbdl = ndgttdzbdl;
    } 
	
    /**
     * 属性 ljgttdzjrl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjgttdzjrl(){
        return ljgttdzjrl;
    }
	
    /**
     * 属性 ljgttdzjrl 的set方法
     * @return
     */
    public void setLjgttdzjrl(BigDecimal ljgttdzjrl){
        this.ljgttdzjrl = ljgttdzjrl;
    } 
	
    /**
     * 属性 ljgttdwcdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjgttdwcdl(){
        return ljgttdwcdl;
    }
	
    /**
     * 属性 ljgttdwcdl 的set方法
     * @return
     */
    public void setLjgttdwcdl(BigDecimal ljgttdwcdl){
        this.ljgttdwcdl = ljgttdwcdl;
    } 
	
    /**
     * 属性 ljzytdwcdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjzytdwcdl(){
        return ljzytdwcdl;
    }
	
    /**
     * 属性 ljzytdwcdl 的set方法
     * @return
     */
    public void setLjzytdwcdl(BigDecimal ljzytdwcdl){
        this.ljzytdwcdl = ljzytdwcdl;
    } 
	
    /**
     * 属性 ljwcdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjwcdl(){
        return ljwcdl;
    }
	
    /**
     * 属性 ljwcdl 的set方法
     * @return
     */
    public void setLjwcdl(BigDecimal ljwcdl){
        this.ljwcdl = ljwcdl;
    } 
	
    /**
     * 属性 ljwcdltq 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjwcdltq(){
        return ljwcdltq;
    }
	
    /**
     * 属性 ljwcdltq 的set方法
     * @return
     */
    public void setLjwcdltq(BigDecimal ljwcdltq){
        this.ljwcdltq = ljwcdltq;
    } 
	
    /**
     * 属性 ljwcjybm 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjwcjybm(){
        return ljwcjybm;
    }
	
    /**
     * 属性 ljwcjybm 的set方法
     * @return
     */
    public void setLjwcjybm(BigDecimal ljwcjybm){
        this.ljwcjybm = ljwcjybm;
    } 
	
    /**
     * 属性 ljwcjpso2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjwcjpso2(){
        return ljwcjpso2;
    }
	
    /**
     * 属性 ljwcjpso2 的set方法
     * @return
     */
    public void setLjwcjpso2(BigDecimal ljwcjpso2){
        this.ljwcjpso2 = ljwcjpso2;
    } 
	
    /**
     * 属性 ljwcjpco2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjwcjpco2(){
        return ljwcjpco2;
    }
	
    /**
     * 属性 ljwcjpco2 的set方法
     * @return
     */
    public void setLjwcjpco2(BigDecimal ljwcjpco2){
        this.ljwcjpco2 = ljwcjpco2;
    } 
	
    /**
     * 属性 sjversion 的get方法
     * @return String
     */
    public String getSjversion(){
        return sjversion;
    }
	
    /**
     * 属性 sjversion 的set方法
     * @return
     */
    public void setSjversion(String sjversion){
        this.sjversion = sjversion;
    } 
	
    /**
     * 属性 xh 的get方法
     * @return BigDecimal
     */
    public BigDecimal getXh(){
        return xh;
    }
	
    /**
     * 属性 xh 的set方法
     * @return
     */
    public void setXh(BigDecimal xh){
        this.xh = xh;
    } 
	
    /**
     * 属性 state 的get方法
     * @return BigDecimal
     */
    public BigDecimal getState(){
        return state;
    }
	
    /**
     * 属性 state 的set方法
     * @return
     */
    public void setState(BigDecimal state){
        this.state = state;
    } 
	
    /**
     * 属性 subjectguid 的get方法
     * @return String
     */
    public String getSubjectguid(){
        return subjectguid;
    }
	
    /**
     * 属性 subjectguid 的set方法
     * @return
     */
    public void setSubjectguid(String subjectguid){
        this.subjectguid = subjectguid;
    } 
	
    /**
     * 属性 fillinman 的get方法
     * @return String
     */
    public String getFillinman(){
        return fillinman;
    }
	
    /**
     * 属性 fillinman 的set方法
     * @return
     */
    public void setFillinman(String fillinman){
        this.fillinman = fillinman;
    } 
	
    /**
     * 属性 fillintime 的get方法
     * @return Date
     */
    public Date getFillintime(){
        return fillintime;
    }
	
    /**
     * 属性 fillintime 的set方法
     * @return
     */
    public void setFillintime(Date fillintime){
        this.fillintime = fillintime;
    } 
	
    /**
     * 属性 bak1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBak1(){
        return bak1;
    }
	
    /**
     * 属性 bak1 的set方法
     * @return
     */
    public void setBak1(BigDecimal bak1){
        this.bak1 = bak1;
    } 
	
    /**
     * 属性 bak2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBak2(){
        return bak2;
    }
	
    /**
     * 属性 bak2 的set方法
     * @return
     */
    public void setBak2(BigDecimal bak2){
        this.bak2 = bak2;
    } 
	
    /**
     * 属性 bak3 的get方法
     * @return String
     */
    public String getBak3(){
        return bak3;
    }
	
    /**
     * 属性 bak3 的set方法
     * @return
     */
    public void setBak3(String bak3){
        this.bak3 = bak3;
    } 
	
    /**
     * 属性 bak4 的get方法
     * @return String
     */
    public String getBak4(){
        return bak4;
    }
	
    /**
     * 属性 bak4 的set方法
     * @return
     */
    public void setBak4(String bak4){
        this.bak4 = bak4;
    } 
	
    /**
     * 属性 bak5 的get方法
     * @return String
     */
    public String getBak5(){
        return bak5;
    }
	
    /**
     * 属性 bak5 的set方法
     * @return
     */
    public void setBak5(String bak5){
        this.bak5 = bak5;
    } 
	
    /**
     * 属性 bak6 的get方法
     * @return String
     */
    public String getBak6(){
        return bak6;
    }
	
    /**
     * 属性 bak6 的set方法
     * @return
     */
    public void setBak6(String bak6){
        this.bak6 = bak6;
    } 
	
    /**
     * 属性 dydl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDydl(){
        return dydl;
    }
	
    /**
     * 属性 dydl 的set方法
     * @return
     */
    public void setDydl(BigDecimal dydl){
        this.dydl = dydl;
    } 
	
    /**
     * 属性 dydltq 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDydltq(){
        return dydltq;
    }
	
    /**
     * 属性 dydltq 的set方法
     * @return
     */
    public void setDydltq(BigDecimal dydltq){
        this.dydltq = dydltq;
    } 
	
    /**
     * 属性 dyjh 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDyjh(){
        return dyjh;
    }
	
    /**
     * 属性 dyjh 的set方法
     * @return
     */
    public void setDyjh(BigDecimal dyjh){
        this.dyjh = dyjh;
    } 
	
    /**
     * 属性 dywcl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDywcl(){
        return dywcl;
    }
	
    /**
     * 属性 dywcl 的set方法
     * @return
     */
    public void setDywcl(BigDecimal dywcl){
        this.dywcl = dywcl;
    } 
	
    /**
     * 属性 zytddl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZytddl(){
        return zytddl;
    }
	
    /**
     * 属性 zytddl 的set方法
     * @return
     */
    public void setZytddl(BigDecimal zytddl){
        this.zytddl = zytddl;
    } 
	
    /**
     * 属性 zytddltq 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZytddltq(){
        return zytddltq;
    }
	
    /**
     * 属性 zytddltq 的set方法
     * @return
     */
    public void setZytddltq(BigDecimal zytddltq){
        this.zytddltq = zytddltq;
    } 
	
    /**
     * 属性 gttdrltq 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGttdrltq(){
        return gttdrltq;
    }
	
    /**
     * 属性 gttdrltq 的set方法
     * @return
     */
    public void setGttdrltq(BigDecimal gttdrltq){
        this.gttdrltq = gttdrltq;
    } 
	
    /**
     * 属性 gttddltq 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGttddltq(){
        return gttddltq;
    }
	
    /**
     * 属性 gttddltq 的set方法
     * @return
     */
    public void setGttddltq(BigDecimal gttddltq){
        this.gttddltq = gttddltq;
    } 
	
    /**
     * 属性 ljgttdxz 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjgttdxz(){
        return ljgttdxz;
    }
	
    /**
     * 属性 ljgttdxz 的set方法
     * @return
     */
    public void setLjgttdxz(BigDecimal ljgttdxz){
        this.ljgttdxz = ljgttdxz;
    } 
	
    /**
     * 属性 ljgttdyjdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjgttdyjdl(){
        return ljgttdyjdl;
    }
	
    /**
     * 属性 ljgttdyjdl 的set方法
     * @return
     */
    public void setLjgttdyjdl(BigDecimal ljgttdyjdl){
        this.ljgttdyjdl = ljgttdyjdl;
    } 
	
    /**
     * 属性 hn 的get方法
     * @return BigDecimal
     */
    public BigDecimal getHn(){
        return hn;
    }
	
    /**
     * 属性 hn 的set方法
     * @return
     */
    public void setHn(BigDecimal hn){
        this.hn = hn;
    } 
	
    /**
     * 属性 dt 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDt(){
        return dt;
    }
	
    /**
     * 属性 dt 的set方法
     * @return
     */
    public void setDt(BigDecimal dt){
        this.dt = dt;
    } 
	
    /**
     * 属性 gd 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGd(){
        return gd;
    }
	
    /**
     * 属性 gd 的set方法
     * @return
     */
    public void setGd(BigDecimal gd){
        this.gd = gd;
    } 
	
    /**
     * 属性 hd 的get方法
     * @return BigDecimal
     */
    public BigDecimal getHd(){
        return hd;
    }
	
    /**
     * 属性 hd 的set方法
     * @return
     */
    public void setHd(BigDecimal hd){
        this.hd = hd;
    } 
	
    /**
     * 属性 zdt 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZdt(){
        return zdt;
    }
	
    /**
     * 属性 zdt 的set方法
     * @return
     */
    public void setZdt(BigDecimal zdt){
        this.zdt = zdt;
    } 
	
    /**
     * 属性 gh 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGh(){
        return gh;
    }
	
    /**
     * 属性 gh 的set方法
     * @return
     */
    public void setGh(BigDecimal gh){
        this.gh = gh;
    } 
	
    /**
     * 属性 qt 的get方法
     * @return BigDecimal
     */
    public BigDecimal getQt(){
        return qt;
    }
	
    /**
     * 属性 qt 的set方法
     * @return
     */
    public void setQt(BigDecimal qt){
        this.qt = qt;
    } 
	
    /**
     * 属性 ljzytddltq 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjzytddltq(){
        return ljzytddltq;
    }
	
    /**
     * 属性 ljzytddltq 的set方法
     * @return
     */
    public void setLjzytddltq(BigDecimal ljzytddltq){
        this.ljzytddltq = ljzytddltq;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof PubTmFdqjywcqktj))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PubTmFdqjywcqktj other = (PubTmFdqjywcqktj) o;	        
	    return new EqualsBuilder()
            .append(this.getGuid(), other.getGuid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("guid"+":"+getGuid())
            .append("tyear"+":"+getTyear())
            .append("tmonth"+":"+getTmonth())
            .append("markerid"+":"+getMarkerid())
            .append("bygttdzbdl"+":"+getBygttdzbdl())
            .append("bygttdzjrl"+":"+getBygttdzjrl())
            .append("bygttdwcdl"+":"+getBygttdwcdl())
            .append("byzytdwcdl"+":"+getByzytdwcdl())
            .append("bywcdl"+":"+getBywcdl())
            .append("bywcdltq"+":"+getBywcdltq())
            .append("bywcjybm"+":"+getBywcjybm())
            .append("bywcjpso2"+":"+getBywcjpso2())
            .append("bywcjpco2"+":"+getBywcjpco2())
            .append("ndgttdzbdl"+":"+getNdgttdzbdl())
            .append("ljgttdzjrl"+":"+getLjgttdzjrl())
            .append("ljgttdwcdl"+":"+getLjgttdwcdl())
            .append("ljzytdwcdl"+":"+getLjzytdwcdl())
            .append("ljwcdl"+":"+getLjwcdl())
            .append("ljwcdltq"+":"+getLjwcdltq())
            .append("ljwcjybm"+":"+getLjwcjybm())
            .append("ljwcjpso2"+":"+getLjwcjpso2())
            .append("ljwcjpco2"+":"+getLjwcjpco2())
            .append("sjversion"+":"+getSjversion())
            .append("xh"+":"+getXh())
            .append("state"+":"+getState())
            .append("subjectguid"+":"+getSubjectguid())
            .append("fillinman"+":"+getFillinman())
            .append("fillintime"+":"+getFillintime())
            .append("bak1"+":"+getBak1())
            .append("bak2"+":"+getBak2())
            .append("bak3"+":"+getBak3())
            .append("bak4"+":"+getBak4())
            .append("bak5"+":"+getBak5())
            .append("bak6"+":"+getBak6())
            .append("dydl"+":"+getDydl())
            .append("dydltq"+":"+getDydltq())
            .append("dyjh"+":"+getDyjh())
            .append("dywcl"+":"+getDywcl())
            .append("zytddl"+":"+getZytddl())
            .append("zytddltq"+":"+getZytddltq())
            .append("gttdrltq"+":"+getGttdrltq())
            .append("gttddltq"+":"+getGttddltq())
            .append("ljgttdxz"+":"+getLjgttdxz())
            .append("ljgttdyjdl"+":"+getLjgttdyjdl())
            .append("hn"+":"+getHn())
            .append("dt"+":"+getDt())
            .append("gd"+":"+getGd())
            .append("hd"+":"+getHd())
            .append("zdt"+":"+getZdt())
            .append("gh"+":"+getGh())
            .append("qt"+":"+getQt())
            .append("ljzytddltq"+":"+getLjzytddltq())
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