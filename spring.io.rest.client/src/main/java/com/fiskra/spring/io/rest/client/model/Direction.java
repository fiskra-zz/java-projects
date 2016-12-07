package com.fiskra.spring.io.rest.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This class represents to model of client response.
 * @author feride
 *
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Direction {
	
	
	private  int depStationId;
	
	private  int arrStationId;
	
	private  boolean directBusRoute;
	
	public Direction(){}

	public int getDepStationId() {
		return depStationId;
	}

	public int getArrStationId() {
		return arrStationId;
	}

	public boolean isDirectBusRoute() {
		return directBusRoute;
	}
	
	
	public void setDepStationId(int depStationId) {
		this.depStationId = depStationId;
	}

	public void setArrStationId(int arrStationId) {
		this.arrStationId = arrStationId;
	}

	public void setDirectBusRoute(boolean directBusRoute) {
		this.directBusRoute = directBusRoute;
	}

	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "value{" + 
					"dept_id=" + depStationId +
	                "arr_id=" + arrStationId +
	                ", is_direct_route='" + directBusRoute + '\'' +
	                '}';
		}

}
