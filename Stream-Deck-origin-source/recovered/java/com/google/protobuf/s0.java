package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum s0 implements A.c {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    SYNTAX_EDITIONS(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final A.d f19403f = new A.d() { // from class: com.google.protobuf.s0.a
        @Override // com.google.protobuf.A.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public s0 findValueByNumber(int i8) {
            return s0.a(i8);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19405a;

    s0(int i8) {
        this.f19405a = i8;
    }

    public static s0 a(int i8) {
        if (i8 == 0) {
            return SYNTAX_PROTO2;
        }
        if (i8 == 1) {
            return SYNTAX_PROTO3;
        }
        if (i8 != 2) {
            return null;
        }
        return SYNTAX_EDITIONS;
    }

    @Override // com.google.protobuf.A.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f19405a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
