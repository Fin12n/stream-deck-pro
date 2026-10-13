package io.sentry;

import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class n3 extends m3 implements Queue {
    public n3(Queue queue) {
        super(queue);
    }

    public static n3 t(Queue queue) {
        return new n3(queue);
    }

    @Override // java.util.Queue
    public Object element() {
        InterfaceC2480b0 interfaceC2480b0A = this.f27231b.a();
        try {
            Object objElement = c().element();
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return objElement;
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        InterfaceC2480b0 interfaceC2480b0A = this.f27231b.a();
        try {
            boolean zEquals = c().equals(obj);
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return zEquals;
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public int hashCode() {
        InterfaceC2480b0 interfaceC2480b0A = this.f27231b.a();
        try {
            int iHashCode = c().hashCode();
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return iHashCode;
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.m3
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Queue c() {
        return (Queue) super.c();
    }

    @Override // java.util.Queue
    public boolean offer(Object obj) {
        InterfaceC2480b0 interfaceC2480b0A = this.f27231b.a();
        try {
            boolean zOffer = c().offer(obj);
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return zOffer;
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.util.Queue
    public Object peek() {
        InterfaceC2480b0 interfaceC2480b0A = this.f27231b.a();
        try {
            Object objPeek = c().peek();
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return objPeek;
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.util.Queue
    public Object poll() {
        InterfaceC2480b0 interfaceC2480b0A = this.f27231b.a();
        try {
            Object objPoll = c().poll();
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return objPoll;
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.util.Queue
    public Object remove() {
        InterfaceC2480b0 interfaceC2480b0A = this.f27231b.a();
        try {
            Object objRemove = c().remove();
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return objRemove;
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        InterfaceC2480b0 interfaceC2480b0A = this.f27231b.a();
        try {
            Object[] array = c().toArray();
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return array;
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        InterfaceC2480b0 interfaceC2480b0A = this.f27231b.a();
        try {
            Object[] array = c().toArray(objArr);
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return array;
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
