package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaWeather的POJO类
 *
 * @author  Administrator  [Wed Jul 17 16:34:48 CST 2013]
 * 
 */
public class BaWeather implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketcode
     */
    private String marketcode;
	
    /** 
     * 属性temperature
     */
    private BigDecimal temperature;
	
    /** 
     * 属性windclass
     */
    private BigDecimal windclass;
	
    /** 
     * 属性winddirection
     */
    private BigDecimal winddirection;
	
    /** 
     * 属性humidity
     */
    private BigDecimal humidity;
	
    /** 
     * 属性weather
     */
    private BigDecimal weather;
	
    /** 
     * 属性datetime
     */
    private Date datetime;
	
    /** 
     * 属性backstr1
     */
    private String backstr1;
	
    /**
     * BaWeather构造函数
     */
    public BaWeather() {
        super();
    }  
	
    /**
     * BaWeather完整的构造函数
     */  
    public BaWeather(String guid,String marketcode,Date datetime){
        this.guid = guid;
        this.marketcode = marketcode;
        this.datetime = datetime;
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
     * 属性 marketcode 的get方法
     * @return String
     */
    public String getMarketcode(){
        return marketcode;
    }
	
    /**
     * 属性 marketcode 的set方法
     * @return
     */
    public void setMarketcode(String marketcode){
        this.marketcode = marketcode;
    } 
	
    /**
     * 属性 temperature 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTemperature(){
        return temperature;
    }
	
    /**
     * 属性 temperature 的set方法
     * @return
     */
    public void setTemperature(BigDecimal temperature){
        this.temperature = temperature;
    } 
	
    /**
     * 属性 windclass 的get方法
     * @return BigDecimal
     */
    public BigDecimal getWindclass(){
        return windclass;
    }
	
    /**
     * 属性 windclass 的set方法
     * @return
     */
    public void setWindclass(BigDecimal windclass){
        this.windclass = windclass;
    } 
	
    /**
     * 属性 winddirection 的get方法
     * @return BigDecimal
     */
    public BigDecimal getWinddirection(){
        return winddirection;
    }
	
    /**
     * 属性 winddirection 的set方法
     * @return
     */
    public void setWinddirection(BigDecimal winddirection){
        this.winddirection = winddirection;
    } 
	
    /**
     * 属性 humidity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getHumidity(){
        return humidity;
    }
	
    /**
     * 属性 humidity 的set方法
     * @return
     */
    public void setHumidity(BigDecimal humidity){
        this.humidity = humidity;
    } 
	
    /**
     * 属性 weather 的get方法
     * @return BigDecimal
     */
    public BigDecimal getWeather(){
        return weather;
    }
	
    /**
     * 属性 weather 的set方法
     * @return
     */
    public void setWeather(BigDecimal weather){
        this.weather = weather;
    } 
	
    /**
     * 属性 datetime 的get方法
     * @return Date
     */
    public Date getDatetime(){
        return datetime;
    }
	
    /**
     * 属性 datetime 的set方法
     * @return
     */
    public void setDatetime(Date datetime){
        this.datetime = datetime;
    } 
	
    /**
     * 属性 backstr1 的get方法
     * @return String
     */
    public String getBackstr1(){
        return backstr1;
    }
	
    /**
     * 属性 backstr1 的set方法
     * @return
     */
    public void setBackstr1(String backstr1){
        this.backstr1 = backstr1;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaWeather))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaWeather other = (BaWeather) o;	        
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
            .append("marketcode"+":"+getMarketcode())
            .append("temperature"+":"+getTemperature())
            .append("windclass"+":"+getWindclass())
            .append("winddirection"+":"+getWinddirection())
            .append("humidity"+":"+getHumidity())
            .append("weather"+":"+getWeather())
            .append("datetime"+":"+getDatetime())
            .append("backstr1"+":"+getBackstr1())
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