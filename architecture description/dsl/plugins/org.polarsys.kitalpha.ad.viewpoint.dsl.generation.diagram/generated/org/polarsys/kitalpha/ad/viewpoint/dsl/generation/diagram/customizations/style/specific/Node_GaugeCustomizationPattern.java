//Generated with EGF 1.3.0.v20150608-0917
package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.customizations.style.specific;

import java.util.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.javaservice.JavaMethodData;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.javaservice.JavaMethodData.JavaMethodReturnType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util.StylePropertyNameValueCouple;

public class Node_GaugeCustomizationPattern extends
		org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.customizations.common.AbstractSpecificNodeCustomizationPattern {

	public Node_GaugeCustomizationPattern() {
		//Here is the constructor
		// add initialisation of the pattern variables (declaration has been already done).

	}

	public void generate(Object argument) throws Exception {
		InternalPatternContext ctx = (InternalPatternContext) argument;
		IQuery.ParameterDescription paramDesc = null;
		Map<String, String> queryCtx = null;
		Node.Container currentNode = ctx.getNode();
		List<Object> parameterList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)

		for (Object parameterParameter : parameterList) {

			this.parameter = (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.GaugeCustomization) parameterParameter;

			if (preCondition(ctx)) {
				ctx.setNode(new Node.Container(currentNode, getClass()));
				orchestration((PatternContext) argument);

			}
		}
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
		}
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		Node.Container currentNode = ictx.getNode();
		super.orchestration(new SuperOrchestrationContext(ictx));
		method_initAlignementKindData(new StringBuffer(), ictx);
		method_initSectionsData(new StringBuffer(), ictx);
		{
			final Map<String, Object> parameters = new HashMap<String, Object>();
			parameters.put("parent", this.parent);
			parameters.put("applyOnAll", this.applyOnAll);
			parameters.put("appliedOn", this.appliedOn);
			parameters.put("stylePropertyData", this.alignementKind);
			ExecutionContext ctx_local = new ExecutionContext(ictx);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram/egf/VpdslSiriusDiagramGenerator.fcore#_IXiPcGdyEeWYaMtt1GGGww",
					ctx_local, parameters);
		}
		{
			final Map<String, Object> parameters = new HashMap<String, Object>();
			parameters.put("parent", this.parent);
			parameters.put("applyOnAll", this.applyOnAll);
			parameters.put("appliedOn", this.appliedOn);
			parameters.put("stylePropertyData", this.sections);
			ExecutionContext ctx_local = new ExecutionContext(ictx);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram/egf/VpdslSiriusDiagramGenerator.fcore#_VpyWIGz4EeWW0teG0FdF7g",
					ctx_local, parameters);
		}
		ictx.setNode(currentNode);
		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("parameter", this.parameter);
			String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
			String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
		}
		return null;
	}

	protected void method_setParentMapping(final StringBuffer out, final PatternContext ctx) throws Exception {
		dslvpElement = parameter;

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setParentMapping", out.toString());
	}

	protected void method_initAlignementKindData(final StringBuffer out, final PatternContext ctx) throws Exception {
		if (parameter.eIsSet(VpstylecustomizationPackage.eINSTANCE.getGaugeCustomization_Alignement())) {
			String enumLiteralName = parameter.getAlignement().toString();
			String methodCode = "return DiagramPackage.eINSTANCE.getAlignmentKind().getEEnumLiteral(\""
					+ enumLiteralName + "\");";
			char first = Character.toUpperCase(enumLiteralName.charAt(0));
			enumLiteralName = first + enumLiteralName.substring(1).toLowerCase();
			String methodName = "getAlignmentKind" + enumLiteralName;

			JavaMethodData javaMethodData = new JavaMethodData(methodName, JavaMethodReturnType.EEnumLiteral,
					methodCode);

			// Set method parameters data
			javaMethodData.addMethodParameter("any", "EObject", "any model element");

			// Set method Required classes FQN
			javaMethodData.getRequiredClassesFQN().add("org.eclipse.emf.ecore.EEnumLiteral");
			javaMethodData.getRequiredClassesFQN().add("org.eclipse.sirius.diagram.DiagramPackage");

			// Add the method to the Java Service.
			if (javaMethodData != null)
				enumHelperJavaServiceData.addMethod(javaMethodData);

			set_alignementKind(new StylePropertyNameValueCouple("alignment", "service:" + methodName));
		}

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "initAlignementKindData", out.toString());
	}

	protected void method_initSectionsData(final StringBuffer out, final PatternContext ctx) throws Exception {
		if (parameter.eIsSet(VpstylecustomizationPackage.eINSTANCE.getGaugeCustomization_Sections())) {
			set_sections(new StylePropertyNameValueCouple("sections", parameter.getSections()));
		}

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "initSectionsData", out.toString());
	}

	protected org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.GaugeCustomization parameter;

	public void set_parameter(
			org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.GaugeCustomization parameter) {
		this.parameter = parameter;
	}

	protected org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util.StylePropertyNameValueCouple alignementKind;

	public void set_alignementKind(
			org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util.StylePropertyNameValueCouple alignementKind) {
		this.alignementKind = alignementKind;
	}

	protected org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util.StylePropertyNameValueCouple sections;

	public void set_sections(
			org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util.StylePropertyNameValueCouple sections) {
		this.sections = sections;
	}

	public Map<String, Object> getParameters() {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parameter", this.parameter);
		return parameters;
	}

}
