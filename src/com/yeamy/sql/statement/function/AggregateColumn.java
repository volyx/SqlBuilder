package com.yeamy.sql.statement.function;

import com.yeamy.sql.statement.Column;

public class AggregateColumn extends Column {
	private final String fun;

	public AggregateColumn(String fun, String name) {
		super(name);
		this.fun = fun;
	}

	public AggregateColumn(String fun, String table, String name) {
		super(table, name);
		this.fun = fun;
	}

	@Override
	public void nameInColumn(StringBuilder sb) {
		sb.append(fun).append('(');
		nameInFunction(sb);
		sb.append(')');
		if (nameAlias != null) {
			sb.append(" AS `").append(nameAlias).append('`');
		}
	}

	@Override
	public void nameInWhere(StringBuilder sb) {
	}

}