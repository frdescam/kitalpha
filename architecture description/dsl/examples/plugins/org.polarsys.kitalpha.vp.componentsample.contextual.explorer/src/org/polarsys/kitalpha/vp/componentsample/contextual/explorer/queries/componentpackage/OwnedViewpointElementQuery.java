
// Generated on 02.10.2015 at 04:26:45 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.kitalpha.vp.componentsample.contextual.explorer.queries.componentpackage;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.amalgam.explorer.contextual.core.query.IQuery;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentPackage;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OwnedViewpointElementQuery implements IQuery {

	/**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * Default constructor
	   * @generated
	   */
	public OwnedViewpointElementQuery() {
		// TODO Auto-generated constructor stub
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param object_p: The model element for which the Contextual Explorer extension is generated
	* @return List of object to display in the parent category
	* @generated
	*/
	public List<Object> compute(Object object_p) {
		List<Object> result = new ArrayList<Object>();
		ComponentPackage object = (ComponentPackage) object_p;

		for (EObject eObject : object.getComponents())
			result.add(eObject);

		return result;
	}

}