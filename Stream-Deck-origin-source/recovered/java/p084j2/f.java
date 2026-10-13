package p084j2;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f28145a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f28146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f28147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f28148c = true;

        public a(TextView textView) {
            this.f28146a = textView;
            this.f28147b = new d(textView);
        }

        @Override // j2.f.b
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f28148c ? f(inputFilterArr) : d(inputFilterArr);
        }

        @Override // j2.f.b
        public void b(boolean z8) {
            if (z8) {
                j();
            }
        }

        @Override // j2.f.b
        public void c(boolean z8) {
            this.f28148c = z8;
            j();
            i();
        }

        public final InputFilter[] d(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f28147b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f28147b;
            return inputFilterArr2;
        }

        public final SparseArray e(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i8 = 0; i8 < inputFilterArr.length; i8++) {
                InputFilter inputFilter = inputFilterArr[i8];
                if (inputFilter instanceof d) {
                    sparseArray.put(i8, inputFilter);
                }
            }
            return sparseArray;
        }

        public final InputFilter[] f(InputFilter[] inputFilterArr) {
            SparseArray sparseArrayE = e(inputFilterArr);
            if (sparseArrayE.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayE.size()];
            int i8 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                if (sparseArrayE.indexOfKey(i9) < 0) {
                    inputFilterArr2[i8] = inputFilterArr[i9];
                    i8++;
                }
            }
            return inputFilterArr2;
        }

        public void g(boolean z8) {
            this.f28148c = z8;
        }

        public final TransformationMethod h(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        public final void i() {
            this.f28146a.setFilters(a(this.f28146a.getFilters()));
        }

        public void j() {
            this.f28146a.setTransformationMethod(l(this.f28146a.getTransformationMethod()));
        }

        public final TransformationMethod k(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
        }

        public TransformationMethod l(TransformationMethod transformationMethod) {
            return this.f28148c ? k(transformationMethod) : h(transformationMethod);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {
        public abstract InputFilter[] a(InputFilter[] inputFilterArr);

        public abstract void b(boolean z8);

        public abstract void c(boolean z8);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f28149a;

        public c(TextView textView) {
            this.f28149a = new a(textView);
        }

        @Override // j2.f.b
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return d() ? inputFilterArr : this.f28149a.a(inputFilterArr);
        }

        @Override // j2.f.b
        public void b(boolean z8) {
            if (d()) {
                return;
            }
            this.f28149a.b(z8);
        }

        @Override // j2.f.b
        public void c(boolean z8) {
            if (d()) {
                this.f28149a.g(z8);
            } else {
                this.f28149a.c(z8);
            }
        }

        public final boolean d() {
            return !androidx.emoji2.text.c.k();
        }
    }

    public f(TextView textView) {
        this(textView, true);
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f28145a.a(inputFilterArr);
    }

    public void b(boolean z8) {
        this.f28145a.b(z8);
    }

    public void c(boolean z8) {
        this.f28145a.c(z8);
    }

    public f(TextView textView, boolean z8) {
        T1.f.h(textView, "textView cannot be null");
        if (z8) {
            this.f28145a = new a(textView);
        } else {
            this.f28145a = new c(textView);
        }
    }
}
