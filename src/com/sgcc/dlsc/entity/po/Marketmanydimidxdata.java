package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * Marketmanydimidxdata的POJO类
 *
 * @author  Administrator  [Mon Jul 21 16:57:53 CST 2014]
 * 
 */
public class Marketmanydimidxdata implements Serializable{

    /** 
     * 属性fguid
     */
    private String fguid;
	
    /** 
     * 属性idxcode
     */
    private String idxcode;
	
    /** 
     * 属性orguniquecode
     */
    private String orguniquecode;
	
    /** 
     * 属性statcalibre
     */
    private String statcalibre;
	
    /** 
     * 属性statcycle
     */
    private String statcycle;
	
    /** 
     * 属性fqid
     */
    private String fqid;
	
    /** 
     * 属性datavalue
     */
    private BigDecimal datavalue;
	
    /** 
     * 属性datavaluelq
     */
    private BigDecimal datavaluelq;
	
    /** 
     * 属性datavaluely
     */
    private BigDecimal datavaluely;
	
    /** 
     * 属性datavaluetot
     */
    private BigDecimal datavaluetot;
	
    /** 
     * 属性datavaluetotlq
     */
    private String datavaluetotlq;
	
    /** 
     * 属性datavaluetotly
     */
    private String datavaluetotly;
	
    /** 
     * 属性dimtypeid1
     */
    private String dimtypeid1;
	
    /** 
     * 属性dimtypeid2
     */
    private String dimtypeid2;
	
    /** 
     * 属性dimtypeid3
     */
    private String dimtypeid3;
	
    /** 
     * 属性dimtypeid4
     */
    private String dimtypeid4;
	
    /** 
     * 属性dimtypeid5
     */
    private String dimtypeid5;
	
    /** 
     * 属性dimtypeid6
     */
    private String dimtypeid6;
	
    /** 
     * 属性dimtypeid7
     */
    private String dimtypeid7;
	
    /** 
     * 属性dimtypeid8
     */
    private String dimtypeid8;
	
    /** 
     * 属性dimvalid1
     */
    private String dimvalid1;
	
    /** 
     * 属性dimvalid2
     */
    private String dimvalid2;
	
    /** 
     * 属性dimvalid3
     */
    private String dimvalid3;
	
    /** 
     * 属性dimvalid4
     */
    private String dimvalid4;
	
    /** 
     * 属性dimvalid5
     */
    private String dimvalid5;
	
    /** 
     * 属性dimvalid6
     */
    private String dimvalid6;
	
    /** 
     * 属性dimvalid7
     */
    private String dimvalid7;
	
    /** 
     * 属性dimvalid8
     */
    private String dimvalid8;
	
    /** 
     * 属性planvalue
     */
    private String planvalue;
	
    /** 
     * 属性planvalueyear
     */
    private String planvalueyear;
	
    /** 
     * 属性datasourceorg
     */
    private String datasourceorg;
	
    /** 
     * 属性datasourcesystem
     */
    private String datasourcesystem;
	
    /** 
     * 属性recordtimestamp
     */
    private String recordtimestamp;
	
    /** 
     * 属性extvalue1
     */
    private String extvalue1;
	
    /** 
     * 属性extvalue2
     */
    private String extvalue2;
	
    /** 
     * 属性extvalue3
     */
    private String extvalue3;
	
    /** 
     * 属性extvalue4
     */
    private String extvalue4;
	
    /** 
     * 属性extvalue5
     */
    private String extvalue5;
	
    /** 
     * 属性periodvaluetot
     */
    private String periodvaluetot;
	
    /** 
     * 属性chainvaluetot
     */
    private String chainvaluetot;
	
    /** 
     * 属性periodvalue
     */
    private String periodvalue;
	
    /** 
     * 属性chainvalue
     */
    private String chainvalue;
	
    /** 
     * 属性verno
     */
    private String verno;
	
    /**
     * Marketmanydimidxdata构造函数
     */
    public Marketmanydimidxdata() {
        super();
    }  
	
    /**
     * Marketmanydimidxdata完整的构造函数
     */  
    public Marketmanydimidxdata(String fguid){
        this.fguid = fguid;
    }
 
    /**
     * 属性 fguid 的get方法
     * @return String
     */
    public String getFguid(){
        return fguid;
    }
	
    /**
     * 属性 fguid 的set方法
     * @return
     */
    public void setFguid(String fguid){
        if(fguid != null && fguid.trim().length() == 0){
            this.fguid = null;
        }else{
            this.fguid = fguid;
        }
    } 
	
    /**
     * 属性 idxcode 的get方法
     * @return String
     */
    public String getIdxcode(){
        return idxcode;
    }
	
    /**
     * 属性 idxcode 的set方法
     * @return
     */
    public void setIdxcode(String idxcode){
        this.idxcode = idxcode;
    } 
	
    /**
     * 属性 orguniquecode 的get方法
     * @return String
     */
    public String getOrguniquecode(){
        return orguniquecode;
    }
	
    /**
     * 属性 orguniquecode 的set方法
     * @return
     */
    public void setOrguniquecode(String orguniquecode){
        this.orguniquecode = orguniquecode;
    } 
	
    /**
     * 属性 statcalibre 的get方法
     * @return String
     */
    public String getStatcalibre(){
        return statcalibre;
    }
	
    /**
     * 属性 statcalibre 的set方法
     * @return
     */
    public void setStatcalibre(String statcalibre){
        this.statcalibre = statcalibre;
    } 
	
    /**
     * 属性 statcycle 的get方法
     * @return String
     */
    public String getStatcycle(){
        return statcycle;
    }
	
    /**
     * 属性 statcycle 的set方法
     * @return
     */
    public void setStatcycle(String statcycle){
        this.statcycle = statcycle;
    } 
	
    /**
     * 属性 fqid 的get方法
     * @return String
     */
    public String getFqid(){
        return fqid;
    }
	
    /**
     * 属性 fqid 的set方法
     * @return
     */
    public void setFqid(String fqid){
        this.fqid = fqid;
    } 
	
    /**
     * 属性 datavalue 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDatavalue(){
        return datavalue;
    }
	
    /**
     * 属性 datavalue 的set方法
     * @return
     */
    public void setDatavalue(BigDecimal datavalue){
        this.datavalue = datavalue;
    } 
	
    /**
     * 属性 datavaluelq 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDatavaluelq(){
        return datavaluelq;
    }
	
    /**
     * 属性 datavaluelq 的set方法
     * @return
     */
    public void setDatavaluelq(BigDecimal datavaluelq){
        this.datavaluelq = datavaluelq;
    } 
	
    /**
     * 属性 datavaluely 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDatavaluely(){
        return datavaluely;
    }
	
    /**
     * 属性 datavaluely 的set方法
     * @return
     */
    public void setDatavaluely(BigDecimal datavaluely){
        this.datavaluely = datavaluely;
    } 
	
    /**
     * 属性 datavaluetot 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDatavaluetot(){
        return datavaluetot;
    }
	
    /**
     * 属性 datavaluetot 的set方法
     * @return
     */
    public void setDatavaluetot(BigDecimal datavaluetot){
        this.datavaluetot = datavaluetot;
    } 
	
    /**
     * 属性 datavaluetotlq 的get方法
     * @return String
     */
    public String getDatavaluetotlq(){
        return datavaluetotlq;
    }
	
    /**
     * 属性 datavaluetotlq 的set方法
     * @return
     */
    public void setDatavaluetotlq(String datavaluetotlq){
        this.datavaluetotlq = datavaluetotlq;
    } 
	
    /**
     * 属性 datavaluetotly 的get方法
     * @return String
     */
    public String getDatavaluetotly(){
        return datavaluetotly;
    }
	
    /**
     * 属性 datavaluetotly 的set方法
     * @return
     */
    public void setDatavaluetotly(String datavaluetotly){
        this.datavaluetotly = datavaluetotly;
    } 
	
    /**
     * 属性 dimtypeid1 的get方法
     * @return String
     */
    public String getDimtypeid1(){
        return dimtypeid1;
    }
	
    /**
     * 属性 dimtypeid1 的set方法
     * @return
     */
    public void setDimtypeid1(String dimtypeid1){
        this.dimtypeid1 = dimtypeid1;
    } 
	
    /**
     * 属性 dimtypeid2 的get方法
     * @return String
     */
    public String getDimtypeid2(){
        return dimtypeid2;
    }
	
    /**
     * 属性 dimtypeid2 的set方法
     * @return
     */
    public void setDimtypeid2(String dimtypeid2){
        this.dimtypeid2 = dimtypeid2;
    } 
	
    /**
     * 属性 dimtypeid3 的get方法
     * @return String
     */
    public String getDimtypeid3(){
        return dimtypeid3;
    }
	
    /**
     * 属性 dimtypeid3 的set方法
     * @return
     */
    public void setDimtypeid3(String dimtypeid3){
        this.dimtypeid3 = dimtypeid3;
    } 
	
    /**
     * 属性 dimtypeid4 的get方法
     * @return String
     */
    public String getDimtypeid4(){
        return dimtypeid4;
    }
	
    /**
     * 属性 dimtypeid4 的set方法
     * @return
     */
    public void setDimtypeid4(String dimtypeid4){
        this.dimtypeid4 = dimtypeid4;
    } 
	
    /**
     * 属性 dimtypeid5 的get方法
     * @return String
     */
    public String getDimtypeid5(){
        return dimtypeid5;
    }
	
    /**
     * 属性 dimtypeid5 的set方法
     * @return
     */
    public void setDimtypeid5(String dimtypeid5){
        this.dimtypeid5 = dimtypeid5;
    } 
	
    /**
     * 属性 dimtypeid6 的get方法
     * @return String
     */
    public String getDimtypeid6(){
        return dimtypeid6;
    }
	
    /**
     * 属性 dimtypeid6 的set方法
     * @return
     */
    public void setDimtypeid6(String dimtypeid6){
        this.dimtypeid6 = dimtypeid6;
    } 
	
    /**
     * 属性 dimtypeid7 的get方法
     * @return String
     */
    public String getDimtypeid7(){
        return dimtypeid7;
    }
	
    /**
     * 属性 dimtypeid7 的set方法
     * @return
     */
    public void setDimtypeid7(String dimtypeid7){
        this.dimtypeid7 = dimtypeid7;
    } 
	
    /**
     * 属性 dimtypeid8 的get方法
     * @return String
     */
    public String getDimtypeid8(){
        return dimtypeid8;
    }
	
    /**
     * 属性 dimtypeid8 的set方法
     * @return
     */
    public void setDimtypeid8(String dimtypeid8){
        this.dimtypeid8 = dimtypeid8;
    } 
	
    /**
     * 属性 dimvalid1 的get方法
     * @return String
     */
    public String getDimvalid1(){
        return dimvalid1;
    }
	
    /**
     * 属性 dimvalid1 的set方法
     * @return
     */
    public void setDimvalid1(String dimvalid1){
        this.dimvalid1 = dimvalid1;
    } 
	
    /**
     * 属性 dimvalid2 的get方法
     * @return String
     */
    public String getDimvalid2(){
        return dimvalid2;
    }
	
    /**
     * 属性 dimvalid2 的set方法
     * @return
     */
    public void setDimvalid2(String dimvalid2){
        this.dimvalid2 = dimvalid2;
    } 
	
    /**
     * 属性 dimvalid3 的get方法
     * @return String
     */
    public String getDimvalid3(){
        return dimvalid3;
    }
	
    /**
     * 属性 dimvalid3 的set方法
     * @return
     */
    public void setDimvalid3(String dimvalid3){
        this.dimvalid3 = dimvalid3;
    } 
	
    /**
     * 属性 dimvalid4 的get方法
     * @return String
     */
    public String getDimvalid4(){
        return dimvalid4;
    }
	
    /**
     * 属性 dimvalid4 的set方法
     * @return
     */
    public void setDimvalid4(String dimvalid4){
        this.dimvalid4 = dimvalid4;
    } 
	
    /**
     * 属性 dimvalid5 的get方法
     * @return String
     */
    public String getDimvalid5(){
        return dimvalid5;
    }
	
    /**
     * 属性 dimvalid5 的set方法
     * @return
     */
    public void setDimvalid5(String dimvalid5){
        this.dimvalid5 = dimvalid5;
    } 
	
    /**
     * 属性 dimvalid6 的get方法
     * @return String
     */
    public String getDimvalid6(){
        return dimvalid6;
    }
	
    /**
     * 属性 dimvalid6 的set方法
     * @return
     */
    public void setDimvalid6(String dimvalid6){
        this.dimvalid6 = dimvalid6;
    } 
	
    /**
     * 属性 dimvalid7 的get方法
     * @return String
     */
    public String getDimvalid7(){
        return dimvalid7;
    }
	
    /**
     * 属性 dimvalid7 的set方法
     * @return
     */
    public void setDimvalid7(String dimvalid7){
        this.dimvalid7 = dimvalid7;
    } 
	
    /**
     * 属性 dimvalid8 的get方法
     * @return String
     */
    public String getDimvalid8(){
        return dimvalid8;
    }
	
    /**
     * 属性 dimvalid8 的set方法
     * @return
     */
    public void setDimvalid8(String dimvalid8){
        this.dimvalid8 = dimvalid8;
    } 
	
    /**
     * 属性 planvalue 的get方法
     * @return String
     */
    public String getPlanvalue(){
        return planvalue;
    }
	
    /**
     * 属性 planvalue 的set方法
     * @return
     */
    public void setPlanvalue(String planvalue){
        this.planvalue = planvalue;
    } 
	
    /**
     * 属性 planvalueyear 的get方法
     * @return String
     */
    public String getPlanvalueyear(){
        return planvalueyear;
    }
	
    /**
     * 属性 planvalueyear 的set方法
     * @return
     */
    public void setPlanvalueyear(String planvalueyear){
        this.planvalueyear = planvalueyear;
    } 
	
    /**
     * 属性 datasourceorg 的get方法
     * @return String
     */
    public String getDatasourceorg(){
        return datasourceorg;
    }
	
    /**
     * 属性 datasourceorg 的set方法
     * @return
     */
    public void setDatasourceorg(String datasourceorg){
        this.datasourceorg = datasourceorg;
    } 
	
    /**
     * 属性 datasourcesystem 的get方法
     * @return String
     */
    public String getDatasourcesystem(){
        return datasourcesystem;
    }
	
    /**
     * 属性 datasourcesystem 的set方法
     * @return
     */
    public void setDatasourcesystem(String datasourcesystem){
        this.datasourcesystem = datasourcesystem;
    } 
	
    /**
     * 属性 recordtimestamp 的get方法
     * @return String
     */
    public String getRecordtimestamp(){
        return recordtimestamp;
    }
	
    /**
     * 属性 recordtimestamp 的set方法
     * @return
     */
    public void setRecordtimestamp(String recordtimestamp){
        this.recordtimestamp = recordtimestamp;
    } 
	
    /**
     * 属性 extvalue1 的get方法
     * @return String
     */
    public String getExtvalue1(){
        return extvalue1;
    }
	
    /**
     * 属性 extvalue1 的set方法
     * @return
     */
    public void setExtvalue1(String extvalue1){
        this.extvalue1 = extvalue1;
    } 
	
    /**
     * 属性 extvalue2 的get方法
     * @return String
     */
    public String getExtvalue2(){
        return extvalue2;
    }
	
    /**
     * 属性 extvalue2 的set方法
     * @return
     */
    public void setExtvalue2(String extvalue2){
        this.extvalue2 = extvalue2;
    } 
	
    /**
     * 属性 extvalue3 的get方法
     * @return String
     */
    public String getExtvalue3(){
        return extvalue3;
    }
	
    /**
     * 属性 extvalue3 的set方法
     * @return
     */
    public void setExtvalue3(String extvalue3){
        this.extvalue3 = extvalue3;
    } 
	
    /**
     * 属性 extvalue4 的get方法
     * @return String
     */
    public String getExtvalue4(){
        return extvalue4;
    }
	
    /**
     * 属性 extvalue4 的set方法
     * @return
     */
    public void setExtvalue4(String extvalue4){
        this.extvalue4 = extvalue4;
    } 
	
    /**
     * 属性 extvalue5 的get方法
     * @return String
     */
    public String getExtvalue5(){
        return extvalue5;
    }
	
    /**
     * 属性 extvalue5 的set方法
     * @return
     */
    public void setExtvalue5(String extvalue5){
        this.extvalue5 = extvalue5;
    } 
	
    /**
     * 属性 periodvaluetot 的get方法
     * @return String
     */
    public String getPeriodvaluetot(){
        return periodvaluetot;
    }
	
    /**
     * 属性 periodvaluetot 的set方法
     * @return
     */
    public void setPeriodvaluetot(String periodvaluetot){
        this.periodvaluetot = periodvaluetot;
    } 
	
    /**
     * 属性 chainvaluetot 的get方法
     * @return String
     */
    public String getChainvaluetot(){
        return chainvaluetot;
    }
	
    /**
     * 属性 chainvaluetot 的set方法
     * @return
     */
    public void setChainvaluetot(String chainvaluetot){
        this.chainvaluetot = chainvaluetot;
    } 
	
    /**
     * 属性 periodvalue 的get方法
     * @return String
     */
    public String getPeriodvalue(){
        return periodvalue;
    }
	
    /**
     * 属性 periodvalue 的set方法
     * @return
     */
    public void setPeriodvalue(String periodvalue){
        this.periodvalue = periodvalue;
    } 
	
    /**
     * 属性 chainvalue 的get方法
     * @return String
     */
    public String getChainvalue(){
        return chainvalue;
    }
	
    /**
     * 属性 chainvalue 的set方法
     * @return
     */
    public void setChainvalue(String chainvalue){
        this.chainvalue = chainvalue;
    } 
	
    /**
     * 属性 verno 的get方法
     * @return String
     */
    public String getVerno(){
        return verno;
    }
	
    /**
     * 属性 verno 的set方法
     * @return
     */
    public void setVerno(String verno){
        this.verno = verno;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof Marketmanydimidxdata))
	        return false; 
			
        if(getFguid() == null) 
	        return false;

        Marketmanydimidxdata other = (Marketmanydimidxdata) o;	        
	    return new EqualsBuilder()
            .append(this.getFguid(), other.getFguid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("fguid"+":"+getFguid())
            .append("idxcode"+":"+getIdxcode())
            .append("orguniquecode"+":"+getOrguniquecode())
            .append("statcalibre"+":"+getStatcalibre())
            .append("statcycle"+":"+getStatcycle())
            .append("fqid"+":"+getFqid())
            .append("datavalue"+":"+getDatavalue())
            .append("datavaluelq"+":"+getDatavaluelq())
            .append("datavaluely"+":"+getDatavaluely())
            .append("datavaluetot"+":"+getDatavaluetot())
            .append("datavaluetotlq"+":"+getDatavaluetotlq())
            .append("datavaluetotly"+":"+getDatavaluetotly())
            .append("dimtypeid1"+":"+getDimtypeid1())
            .append("dimtypeid2"+":"+getDimtypeid2())
            .append("dimtypeid3"+":"+getDimtypeid3())
            .append("dimtypeid4"+":"+getDimtypeid4())
            .append("dimtypeid5"+":"+getDimtypeid5())
            .append("dimtypeid6"+":"+getDimtypeid6())
            .append("dimtypeid7"+":"+getDimtypeid7())
            .append("dimtypeid8"+":"+getDimtypeid8())
            .append("dimvalid1"+":"+getDimvalid1())
            .append("dimvalid2"+":"+getDimvalid2())
            .append("dimvalid3"+":"+getDimvalid3())
            .append("dimvalid4"+":"+getDimvalid4())
            .append("dimvalid5"+":"+getDimvalid5())
            .append("dimvalid6"+":"+getDimvalid6())
            .append("dimvalid7"+":"+getDimvalid7())
            .append("dimvalid8"+":"+getDimvalid8())
            .append("planvalue"+":"+getPlanvalue())
            .append("planvalueyear"+":"+getPlanvalueyear())
            .append("datasourceorg"+":"+getDatasourceorg())
            .append("datasourcesystem"+":"+getDatasourcesystem())
            .append("recordtimestamp"+":"+getRecordtimestamp())
            .append("extvalue1"+":"+getExtvalue1())
            .append("extvalue2"+":"+getExtvalue2())
            .append("extvalue3"+":"+getExtvalue3())
            .append("extvalue4"+":"+getExtvalue4())
            .append("extvalue5"+":"+getExtvalue5())
            .append("periodvaluetot"+":"+getPeriodvaluetot())
            .append("chainvaluetot"+":"+getChainvaluetot())
            .append("periodvalue"+":"+getPeriodvalue())
            .append("chainvalue"+":"+getChainvalue())
            .append("verno"+":"+getVerno())
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