package I6;

import C6.G;
import C6.q;
import C6.r;
import java.io.Serializable;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements G6.d, e, Serializable {
    private final G6.d<Object> completion;

    public a(G6.d<Object> dVar) {
        this.completion = dVar;
    }

    public G6.d<G> create(G6.d<?> completion) {
        t.g(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // I6.e
    public e getCallerFrame() {
        G6.d<Object> dVar = this.completion;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public final G6.d<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // G6.d
    public final void resumeWith(Object obj) {
        G6.d<Object> dVar = this;
        while (true) {
            h.b(dVar);
            a aVar = (a) dVar;
            G6.d<Object> dVar2 = aVar.completion;
            t.d(dVar2);
            try {
                Object objInvokeSuspend = aVar.invokeSuspend(obj);
                if (objInvokeSuspend == H6.c.f()) {
                    return;
                } else {
                    obj = q.b(objInvokeSuspend);
                }
            } catch (Throwable th) {
                q.a aVar2 = q.f1441b;
                obj = q.b(r.a(th));
            }
            aVar.releaseIntercepted();
            if (!(dVar2 instanceof a)) {
                dVar2.resumeWith(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public G6.d<G> create(Object obj, G6.d<?> completion) {
        t.g(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
