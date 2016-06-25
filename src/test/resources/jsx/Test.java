
public class MyTest
{
	public void trivial()
	{
		<div />
	}
	
	public void simpleAttributes()
	{
		<div foo="noise" bar="girls" />
	}
	
	public void simpleExpression()
	{
		<div foo={"noise".toUpperCase()} bar={5+2} />
	}
	
	public void childElements()
	{
		<div><p><span /><span /><span /></p></div>
	}
	
	public void childExpressions()
	{
		<div>{"noise".toUpperCase()}{5+2}</div>
	}
	
	public void functionAttribute()
	{
		<div foo={System.out::println} />
	}

	public void multiLine()
	{
		<div>
			<span />
		</div>
	}

	public void interleaved()
	{
		System.out.println("start");
		
		<div>
			<span />
		</div>

		System.out.println("middle");

		<div>
			<span />
		</div>

		System.out.println("end");
	}

	public void complex()
	{
		<div>
			<p foo="noise">
				<span foo={System.out::println} />
				{"noise".toUpperCase()}
				<span foo={System.out::println} />
			</p>
		</div>
	}
}
