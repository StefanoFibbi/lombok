class BuilderSingularWithPrefixes {
	private java.util.List<String> _elems;
	@java.lang.SuppressWarnings("all")
	BuilderSingularWithPrefixes(final java.util.List<String> elems) {
		this._elems = elems;
	}
	@java.lang.SuppressWarnings("all")
	public static class BuilderSingularWithPrefixesBuilder {
		@java.lang.SuppressWarnings("all")
		private java.util.ArrayList<String> elems;
		@java.lang.SuppressWarnings("all")
		BuilderSingularWithPrefixesBuilder() {
		}
		@java.lang.SuppressWarnings("all")
		public BuilderSingularWithPrefixesBuilder withElem(final String elem) {
			if (this.elems == null) this.elems = new java.util.ArrayList<String>();
			this.elems.add(elem);
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderSingularWithPrefixesBuilder withElems(final java.util.Collection<? extends String> elems) {
			if (this.elems == null) this.elems = new java.util.ArrayList<String>();
			this.elems.addAll(elems);
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderSingularWithPrefixesBuilder clearElems() {
			if (this.elems != null) this.elems.clear();
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderSingularWithPrefixes build() {
			java.util.List<String> elems;
			switch (this.elems == null ? 0 : this.elems.size()) {
			case 0: 
				elems = java.util.Collections.emptyList();
				break;
			case 1: 
				elems = java.util.Collections.singletonList(this.elems.get(0));
				break;
			default: 
				elems = java.util.Collections.unmodifiableList(new java.util.ArrayList<String>(this.elems));
			}
			return new BuilderSingularWithPrefixes(elems);
		}
		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		public java.lang.String toString() {
			return "BuilderSingularWithPrefixes.BuilderSingularWithPrefixesBuilder(elems=" + this.elems + ")";
		}
	}
	@java.lang.SuppressWarnings("all")
	public static BuilderSingularWithPrefixesBuilder builder() {
		return new BuilderSingularWithPrefixesBuilder();
	}
}
