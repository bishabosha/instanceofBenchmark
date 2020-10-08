package de.michaeldorner;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.*;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 100, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 1000, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(10)
@State(Scope.Benchmark)
public class MyBenchmark {

	private Base base;
	private List<Base> classes = Arrays.asList(new A(), new B(), new C(), new D(), new E(), new F(), new G(), new H(),
			new I(), new J(), new K(), new L(), new M(), new N(), new O(), new P(), new Q(), new R());
	private Random random = new Random();

	@Setup(Level.Trial)
	public void setup() {
		setNewClass();
	}

	@Setup(Level.Invocation)
	public void setNewClass() {
		int index = random.nextInt(classes.size());
		base = classes.get(index);
	}

	@Benchmark
	public void measureINSTANCEOF() {
		if (base instanceof A) {
			((A) base).doA();
		} else if (base instanceof B) {
			((B) base).doB();
		} else if (base instanceof C) {
			((C) base).doC();
		} else if (base instanceof D) {
			((D) base).doD();
		} else if (base instanceof E) {
			((E) base).doE();
		} else if (base instanceof F) {
			((F) base).doF();
		} else if (base instanceof G) {
			((G) base).doG();
		} else if (base instanceof H) {
			((H) base).doH();
		} else if (base instanceof I) {
			((I) base).doI();
		} else if (base instanceof J) {
			((J) base).doJ();
		} else if (base instanceof K) {
			((K) base).doK();
		} else if (base instanceof L) {
			((L) base).doL();
		} else if (base instanceof M) {
			((M) base).doM();
		} else if (base instanceof N) {
			((N) base).doN();
		} else if (base instanceof O) {
			((O) base).doO();
		} else if (base instanceof P) {
			((P) base).doP();
		} else if (base instanceof Q) {
			((Q) base).doQ();
		} else if (base instanceof R) {
			((R) base).doR();
		}

	}

	@Benchmark
	public void measureOO() {
		base.doSomething();
	}

	@Benchmark
	public void measureTYPE() {
		switch (base.type) {
		case A:
			((A) base).doA();
			break;
		case B:
			((B) base).doB();
			break;
		case C:
			((C) base).doC();
			break;
		case D:
			((D) base).doD();
			break;
		case E:
			((E) base).doE();
			break;
		case F:
			((F) base).doF();
			break;
		case G:
			((G) base).doG();
			break;
		case H:
			((H) base).doH();
			break;
		case I:
			((I) base).doI();
			break;
		case J:
			((J) base).doJ();
			break;
		case K:
			((K) base).doK();
			break;
		case L:
			((L) base).doL();
			break;
		case M:
			((M) base).doM();
			break;
		case N:
			((N) base).doN();
			break;
		case O:
			((O) base).doO();
			break;
		case P:
			((P) base).doP();
			break;
		case Q:
			((Q) base).doQ();
			break;
		case R:
			((R) base).doR();
			break;
		default:
			break;
		}
	}

	@Benchmark
	public void measureTAG() {
		switch (base.tag) {
		case Tags.A:
			((A) base).doA();
			break;
		case Tags.B:
			((B) base).doB();
			break;
		case Tags.C:
			((C) base).doC();
			break;
		case Tags.D:
			((D) base).doD();
			break;
		case Tags.E:
			((E) base).doE();
			break;
		case Tags.F:
			((F) base).doF();
			break;
		case Tags.G:
			((G) base).doG();
			break;
		case Tags.H:
			((H) base).doH();
			break;
		case Tags.I:
			((I) base).doI();
			break;
		case Tags.J:
			((J) base).doJ();
			break;
		case Tags.K:
			((K) base).doK();
			break;
		case Tags.L:
			((L) base).doL();
			break;
		case Tags.M:
			((M) base).doM();
			break;
		case Tags.N:
			((N) base).doN();
			break;
		case Tags.O:
			((O) base).doO();
			break;
		case Tags.P:
			((P) base).doP();
			break;
		case Tags.Q:
			((Q) base).doQ();
			break;
		case Tags.R:
			((R) base).doR();
			break;
		default:
			break;
		}
	}

	@Benchmark
	public void measureGETCLASS() {
		if (base.getClass() == A.class) {
			((A) base).doA();
		} else if (base.getClass() == B.class) {
			((B) base).doB();
		} else if (base.getClass() == C.class) {
			((C) base).doC();
		} else if (base.getClass() == D.class) {
			((D) base).doD();
		} else if (base.getClass() == E.class) {
			((E) base).doE();
		} else if (base.getClass() == F.class) {
			((F) base).doF();
		} else if (base.getClass() == G.class) {
			((G) base).doG();
		} else if (base.getClass() == H.class) {
			((H) base).doH();
		} else if (base.getClass() == I.class) {
			((I) base).doI();
		} else if (base.getClass() == J.class) {
			((J) base).doJ();
		} else if (base.getClass() == K.class) {
			((K) base).doK();
		} else if (base.getClass() == L.class) {
			((L) base).doL();
		} else if (base.getClass() == M.class) {
			((M) base).doM();
		} else if (base.getClass() == N.class) {
			((N) base).doN();
		} else if (base.getClass() == O.class) {
			((O) base).doO();
		} else if (base.getClass() == P.class) {
			((P) base).doP();
		} else if (base.getClass() == Q.class) {
			((Q) base).doQ();
		} else if (base.getClass() == R.class) {
			((R) base).doR();
		}
	}
}
