package BQJDBC.QueryResultTest;

public enum Tokens {
    EXPRESSION ("EXPRESSION"),
    FROMEXPRESSION ("FROMEXPRESSION"),
    SELECTSTATEMENT ("SELECTSTATEMENT"),
    SUBQUERY ("SUBQUERY"),
    SOURCETABLE ("SOURCETABLE"),
    MULTIPLECALL ("MULTIPLECALL"),
    ALIAS ("ALIAS"),
    TEXT ("TEXT"),
    TABLENAME ("TABLENAME"),
    DATASETNAME ("DATASETNAME"),
    PROJECTNAME ("PROJECTNAME"),
    COLUMN ("COLUMN"),
    JOKERCALL ("*"),
    ORDERBYEXPRESSION ("ORDERBYEXPRESSION"),
    FUNCTIONCALL ("FUNCTIONCALL"),
    NAME ("NAME"),
    WHEREEXPRESSION ("WHEREEXPRESSION"),
    BOOLEANEXPRESSION ("BOOLEANEXPRESSION"),
    HAVINGEXPRESSION ("HAVINGEXPRESSION"),
    FUNCTIONPARAMETERS ("FUNCTIONPARAMETERS"),
    INTEGERPARAM ("INTEGERPARAM"),
    STRINGLIT ("STRINGLIT"),
    ONCLAUSE ("ONCLAUSE"),
    CONDITION ("CONDITION"),
    JOINEXPRESSION ("JOINEXPRESSION"),
    DIVIDER ("DIVIDER"),
    COMPARISONOPERATOR ("COMPARISONOPERATOR"),
    LOGICALOPERATOR ("LOGICALOPERATOR"), 
    EXPRESSIONTEXT ("EXPRESSIONTEXT"),
    KEYWORD ("KEYWORD"),
    SCOPE ("SCOPE")
;

    Tokens()
    {
        
    }
    String value;
    Tokens(String s) {
        this.value = s;
    }
    public String getValue() {
        return this.value;
    }
    @Override
    public String toString() {
        if(value==null)
        return super.toString();
        else
            return value;
    }
}
    
