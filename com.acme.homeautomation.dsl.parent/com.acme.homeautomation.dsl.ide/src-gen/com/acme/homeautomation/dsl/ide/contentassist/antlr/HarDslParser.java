/*
 * generated by Xtext 2.14.0
 */
package com.acme.homeautomation.dsl.ide.contentassist.antlr;

import com.acme.homeautomation.dsl.ide.contentassist.antlr.internal.InternalHarDslParser;
import com.acme.homeautomation.dsl.services.HarDslGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class HarDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(HarDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, HarDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getDeclarationAccess().getAlternatives(), "rule__Declaration__Alternatives");
			builder.put(grammarAccess.getDeviceAccess().getGroup(), "rule__Device__Group__0");
			builder.put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getModelAccess().getDeclarationsAssignment(), "rule__Model__DeclarationsAssignment");
			builder.put(grammarAccess.getDeviceAccess().getNameAssignment_1(), "rule__Device__NameAssignment_1");
			builder.put(grammarAccess.getDeviceAccess().getStatesAssignment_4(), "rule__Device__StatesAssignment_4");
			builder.put(grammarAccess.getStateAccess().getNameAssignment(), "rule__State__NameAssignment");
			builder.put(grammarAccess.getRuleAccess().getDescriptionAssignment_1(), "rule__Rule__DescriptionAssignment_1");
			builder.put(grammarAccess.getRuleAccess().getWhenAssignment_3(), "rule__Rule__WhenAssignment_3");
			builder.put(grammarAccess.getRuleAccess().getThenAssignment_5(), "rule__Rule__ThenAssignment_5");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private HarDslGrammarAccess grammarAccess;

	@Override
	protected InternalHarDslParser createParser() {
		InternalHarDslParser result = new InternalHarDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public HarDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(HarDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
