package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum e0 implements A.c {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final A.d f19279d = new A.d() { // from class: com.google.protobuf.e0.a
        @Override // com.google.protobuf.A.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e0 findValueByNumber(int i8) {
            return e0.a(i8);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19281a;

    e0(int i8) {
        this.f19281a = i8;
    }

    public static e0 a(int i8) {
        if (i8 != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    @Override // com.google.protobuf.A.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f19281a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
