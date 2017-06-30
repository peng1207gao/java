<?xml version="1.0" encoding="UTF-8"?>
<app-data>
<database name="db" package="null" defaultIdMethod="null" baseClass="BaseObject" basePeer="BasePeer">
<table name="BA_INTERTIE" id="402881d7443363310144336331540000" javaName="BaIntertie" idMethod="uuid.hex" isLinkTable="false" skipSql="false" abstract="false" chineseDescription="???" generatePO="true" lazy="true" generatePK="true" generateFK="true">
    <meta key="height" value="480" />
    <meta key="width" value="220" />
    <meta key="xpos" value="0" />
    <meta key="ypos" value="0" />
    <column name="LINKID" id="402881d7443363310144336331630001" javaName="linkid" description="???ID" primaryKey="true" required="true" type="VARCHAR" size="36" inputSize="80" order="false" />
    <column name="LINKNAME" id="402881d7443363310144336336480002" javaName="linkname" description="?????" required="true" type="VARCHAR" size="64" inputSize="80" order="false" />
    <column name="LINKTYPE" id="402881d7443363310144336336480003" javaName="linktype" description="?????,   1-???2- ??3- ??" required="false" type="NUMERIC" size="2,0" inputSize="80" order="false" />
    <column name="ENERGYTYPE" id="402881d7443363310144336336480004" javaName="energytype" description="??????,   1-???2-??" required="false" type="NUMERIC" size="2,0" inputSize="80" order="false" />
    <column name="VOLTAGEGRADE" id="402881d7443363310144336336480005" javaName="voltagegrade" description="????,  ???KV" required="false" type="NUMERIC" size="2,0" inputSize="80" order="false" />
    <column name="MAXCAPACITY" id="402881d7443363310144336336480006" javaName="maxcapacity" description="????????,   ???MW???" required="false" type="NUMERIC" size="16,4" inputSize="80" order="false" />
    <column name="REVERSECAPACITY" id="402881d7443363310144336336480007" javaName="reversecapacity" description="????????" required="false" type="NUMERIC" size="16,4" inputSize="80" order="false" />
    <column name="REGISTERDATE" id="402881d7443363310144336336480008" javaName="registerdate" description="????" required="true" type="DATE" editorType="datetime" inputSize="80" order="false" />
    <column name="CONDUCTORTYPE" id="402881d7443363310144336336480009" javaName="conductortype" description="????" required="false" type="VARCHAR" size="36" inputSize="80" order="false" />
    <column name="LINELENGTH" id="402881d744336331014433633648000a" javaName="linelength" description="????" required="false" type="NUMERIC" size="16,4" inputSize="80" order="false" />
    <column name="DISPATCHUNIT" id="402881d744336331014433633648000b" javaName="dispatchunit" description="???????" required="false" type="VARCHAR" size="36" inputSize="80" order="false" />
    <column name="STARTEFFECTIVEDATE" id="402881d744336331014433633648000c" javaName="starteffectivedate" description="????" required="true" type="DATE" editorType="datetime" inputSize="80" order="false" />
    <column name="ENDEFFECTIVEDATE" id="402881d744336331014433633649000d" javaName="endeffectivedate" description="????" required="false" type="DATE" editorType="datetime" inputSize="80" order="false" />
    <column name="LINKCODE" id="402881d744336331014433633649000e" javaName="linkcode" description="?????" required="false" type="VARCHAR" size="32" inputSize="80" order="false" />
    <column name="STARTGATEID" id="402881d744336331014433633649000f" javaName="startgateid" description="????ID" required="false" type="VARCHAR" size="36" inputSize="80" order="false" />
    <column name="ENDGATEID" id="402881d7443363310144336336490010" javaName="endgateid" description="????ID" required="false" type="VARCHAR" size="36" inputSize="80" order="false" />
    <column name="LOSS" id="402881d7443363310144336336490011" javaName="loss" description="????" required="false" type="NUMERIC" size="12,4" inputSize="80" order="false" />
    <column name="UPDATETIME" id="402881d7443363310144336336490012" javaName="updatetime" description="??????" required="false" type="DATE" editorType="datetime" inputSize="80" order="false" />
    <column name="UPDATEPERSONID" id="402881d7443363310144336336490013" javaName="updatepersonid" description="???????" required="false" type="VARCHAR" size="36" inputSize="80" order="false" />
    <column name="ISDELETE" id="402881d7443363310144336336490014" javaName="isdelete" description="????" required="true" type="NUMERIC" size="1,0" inputSize="80" order="false" />
    <column name="MARKETID" id="402881d7443363310144336336490015" javaName="marketid" description="????ID?????????????????????????????" required="true" type="VARCHAR" size="36" inputSize="80" order="false" />
    <column name="GUID" id="402881d7443363310144336336490016" javaName="guid" description="GUID????????????????" required="false" type="VARCHAR" size="36" inputSize="80" order="false" />
    <column name="SUPERLINKID" id="402881d7443363310144336336490017" javaName="superlinkid" description="?????ID" required="false" type="VARCHAR" size="36" inputSize="80" order="false" />
</table>
</database>
</app-data>