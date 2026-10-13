package io.sentry;

import io.sentry.util.C2569a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m3 implements Collection, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection f27230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2569a f27231b;

    public m3(Collection collection) {
        if (collection == null) {
            throw new NullPointerException("Collection must not be null.");
        }
        this.f27230a = collection;
        this.f27231b = new C2569a();
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        InterfaceC2480b0 interfaceC2480b0A = this.f27231b.a();
        try {
            boolean zAdd = c().add(obj);
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return zAdd;
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
    public boolean addAll(Collection collection) {
        InterfaceC2480b0 interfaceC2480b0A = this.f27231b.a();
        try {
            boolean zAddAll = c().addAll(collection);
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return zAddAll;
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

    public Collection c() {
        return this.f27230a;
    }

    @Override // java.util.Collection
    public void clear() {
        InterfaceC2480b0 interfaceC2480b0A = this.f27231b.a();
        try {
            c().clear();
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
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
    public boolean contains(Object obj) {
        InterfaceC2480b0 interfaceC2480b0A = this.f27231b.a();
        try {
            boolean zContains = c().contains(obj);
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return zContains;
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
    public boolean containsAll(Collection collection) {
        InterfaceC2480b0 interfaceC2480b0A = this.f27231b.a();
        try {
            boolean zContainsAll = c().containsAll(collection);
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return zContainsAll;
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
    public boolean isEmpty() {
        InterfaceC2480b0 interfaceC2480b0A = this.f27231b.a();
        try {
            boolean zIsEmpty = c().isEmpty();
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return zIsEmpty;
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

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return c().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        InterfaceC2480b0 interfaceC2480b0A = this.f27231b.a();
        try {
            boolean zRemove = c().remove(obj);
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return zRemove;
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
    public boolean removeAll(Collection collection) {
        InterfaceC2480b0 interfaceC2480b0A = this.f27231b.a();
        try {
            boolean zRemoveAll = c().removeAll(collection);
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return zRemoveAll;
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
    public boolean retainAll(Collection collection) {
        InterfaceC2480b0 interfaceC2480b0A = this.f27231b.a();
        try {
            boolean zRetainAll = c().retainAll(collection);
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return zRetainAll;
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
    public int size() {
        InterfaceC2480b0 interfaceC2480b0A = this.f27231b.a();
        try {
            int size = c().size();
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return size;
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

    public String toString() {
        InterfaceC2480b0 interfaceC2480b0A = this.f27231b.a();
        try {
            String string = c().toString();
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return string;
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
