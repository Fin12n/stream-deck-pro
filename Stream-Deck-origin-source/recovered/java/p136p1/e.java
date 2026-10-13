package p136p1;

import java.text.CharacterIterator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e implements CharacterIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f31043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31046d;

    public e(CharSequence charSequence, int i8, int i9) {
        this.f31043a = charSequence;
        this.f31044b = i8;
        this.f31045c = i9;
        this.f31046d = i8;
    }

    @Override // java.text.CharacterIterator
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i8 = this.f31046d;
        if (i8 == this.f31045c) {
            return (char) 65535;
        }
        return this.f31043a.charAt(i8);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.f31046d = this.f31044b;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.f31044b;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.f31045c;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.f31046d;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i8 = this.f31044b;
        int i9 = this.f31045c;
        if (i8 == i9) {
            this.f31046d = i9;
            return (char) 65535;
        }
        int i10 = i9 - 1;
        this.f31046d = i10;
        return this.f31043a.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i8 = this.f31046d + 1;
        this.f31046d = i8;
        int i9 = this.f31045c;
        if (i8 < i9) {
            return this.f31043a.charAt(i8);
        }
        this.f31046d = i9;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i8 = this.f31046d;
        if (i8 <= this.f31044b) {
            return (char) 65535;
        }
        int i9 = i8 - 1;
        this.f31046d = i9;
        return this.f31043a.charAt(i9);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i8) {
        int i9 = this.f31044b;
        if (i8 > this.f31045c || i9 > i8) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f31046d = i8;
        return current();
    }
}
