/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.patientflags.comparator;

import java.util.Comparator;

import org.openmrs.module.patientflags.Priority;

/**
 * Compares Flags based on the Rank of their associated Priorities
 */
public class PriorityComparator implements Comparator<Priority>{
	public int compare(Priority o1, Priority o2) {
	    
		if (o1 == null) {
			return -1;
		}
		
		if (o2 == null) {
			return 1;
		}
		
		Integer rank1 = o1.getRank();
		Integer rank2 = o2.getRank();
		
		if(rank1 < rank2){
			return -1;
		}
		else if(rank1 > rank2){
			return 1;
		}
		else{
			return 0;
		}
	}
}
