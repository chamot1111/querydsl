/**
 * 
 */
package com.mysema.query.domain.p5;

import java.util.Date;

import com.mysema.query.annotations.QuerySupertype;

@QuerySupertype
public class DateEnabled extends IdEntity{

    public Date dateField;
}