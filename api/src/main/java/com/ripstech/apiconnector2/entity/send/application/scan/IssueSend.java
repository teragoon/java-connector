package com.ripstech.apiconnector2.entity.send.application.scan;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class IssueSend {

	private Issue issue;
	private Source source;
	private Sink sink;
	private Concat concat;
	private List<Markup> markups;
	private List<Summary> summaries;

	public static IssueSend createPost(Issue issue) {
		return new IssueSend().setIssue(issue);
	}

	public static Issue createIssue(int type, int depth) {
		return new Issue(type, depth);
	}

	public static Source createSource() {
		return new Source();
	}

	public static Sink createSink() {
		return new Sink();
	}

	public static Concat createConcat() {
		return new Concat();
	}

	public static Markup createMarkup() {
		return new Markup();
	}

	public static Summary createSummary() {
		return new Summary();
	}

	private IssueSend() {}

	public Issue getIssue() {
		return this.issue;
	}

	public Source getSource() {
		return this.source;
	}

	public Sink getSink() {
		return this.sink;
	}

	public Concat getConcat() {
		return this.concat;
	}

	public List<Markup> getMarkups() {
		return this.markups;
	}

	public List<Summary> getSummaries() {
		return this.summaries;
	}

	public IssueSend setIssue(Issue issue) {
		this.issue = issue;
		return this;
	}

	public IssueSend setSource(Source source) {
		this.source = source;
		return this;
	}

	public IssueSend setSink(Sink sink) {
		this.sink = sink;
		return this;
	}

	public IssueSend setConcat(Concat concat) {
		this.concat = concat;
		return this;
	}

	public IssueSend setMarkups(List<Markup> markups) {
		this.markups = markups;
		return this;
	}

	public IssueSend setSummaries(List<Summary> summaries) {
		this.summaries = summaries;
		return this;
	}

	private static class Issue {
		private Integer type;
		private Integer origin;
		private Integer depth;
		private String cve;
		private Boolean directlyCalled;
		private Boolean registerGlobals;
		private String tool;

		private Issue(int type, int depth) {
			this.type = type;
			this.depth = depth;
		}

		public Integer getType() {
			return this.type;
		}

		public Integer getOrigin() {
			return this.origin;
		}

		public Integer getDepth() {
			return this.depth;
		}

		public String getCve() {
			return cve;
		}

		public Boolean getDirectlyCalled() {
			return directlyCalled;
		}

		public Boolean getRegisterGlobals() {
			return registerGlobals;
		}

		public String getTool() {
			return tool;
		}

		public Issue setType(Integer type) {
			this.type = type;
			return this;
		}

		public Issue setOrigin(Integer origin) {
			this.origin = origin;
			return this;
		}

		public Issue setDepth(Integer depth) {
			this.depth = depth;
			return this;
		}

		public Issue setCve(String cve) {
			this.cve = cve;
			return this;
		}

		public Issue setDirectlyCalled(Boolean directlyCalled) {
			this.directlyCalled = directlyCalled;
			return this;
		}

		public Issue setRegisterGlobals(Boolean registerGlobals) {
			this.registerGlobals = registerGlobals;
			return this;
		}

		public Issue setTool(String tool) {
			this.tool = tool;
			return this;
		}
	}

	private static class Source {
		private Integer line;
		private String name;
		private String parameter;
		private Integer file;
		private Integer function;
		@JsonProperty("class")
		private Integer clazz;

		public Integer getLine() {
			return this.line;
		}

		public String getName() {
			return this.name;
		}

		public String getParameter() {
			return this.parameter;
		}

		public Integer getFile() {
			return this.file;
		}

		public Integer getFunction() {
			return this.function;
		}

		public Integer getClazz() {
			return this.clazz;
		}

		public Source setLine(Integer line) {
			this.line = line;
			return this;
		}

		public Source setName(String name) {
			this.name = name;
			return this;
		}

		public Source setParameter(String parameter) {
			this.parameter = parameter;
			return this;
		}

		public Source setFile(Integer file) {
			this.file = file;
			return this;
		}

		public Source setFunction(Integer function) {
			this.function = function;
			return this;
		}

		public Source setClazz(Integer clazz) {
			this.clazz = clazz;
			return this;
		}
	}

	private static class Sink {
		private Integer line;
		private String name;
		private Integer file;
		private Integer function;
		@JsonProperty("class")
		private Integer clazz;

		public Integer getLine() {
			return this.line;
		}

		public String getName() {
			return this.name;
		}

		public Integer getFile() {
			return this.file;
		}

		public Integer getFunction() {
			return this.function;
		}

		public Integer getClazz() {
			return this.clazz;
		}

		public Sink setLine(Integer line) {
			this.line = line;
			return this;
		}

		public Sink setName(String name) {
			this.name = name;
			return this;
		}

		public Sink setFile(Integer file) {
			this.file = file;
			return this;
		}

		public Sink setFunction(Integer function) {
			this.function = function;
			return this;
		}

		public Sink setClazz(Integer clazz) {
			this.clazz = clazz;
			return this;
		}
	}

	private static class Concat {
		private Integer line;
		private String name;
		private Integer function;
		@JsonProperty("class")
		private Integer clazz;

		public Integer getLine() {
			return this.line;
		}

		public String getName() {
			return this.name;
		}

		public Integer getFunction() {
			return this.function;
		}

		public Integer getClazz() {
			return this.clazz;
		}

		public Concat setLine(Integer line) {
			this.line = line;
			return this;
		}

		public Concat setName(String name) {
			this.name = name;
			return this;
		}

		public Concat setFunction(Integer function) {
			this.function = function;
			return this;
		}

		public Concat setClazz(Integer clazz) {
			this.clazz = clazz;
			return this;
		}
	}

	public static class Markup {
		private String markup;

		public String getMarkup() {
			return this.markup;
		}

		public Markup setMarkup(String markup) {
			this.markup = markup;
			return this;
		}
	}

	private static class Summary {
		private Integer line;
		private String content;
		private Integer file;

		public Integer getLine() {
			return this.line;
		}

		public String getContent() {
			return this.content;
		}

		public Integer getFile() {
			return this.file;
		}

		public Summary setLine(Integer line) {
			this.line = line;
			return this;
		}

		public Summary setContent(String content) {
			this.content = content;
			return this;
		}

		public Summary setFile(Integer file) {
			this.file = file;
			return this;
		}
	}

}