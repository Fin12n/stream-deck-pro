package com.revenuecat.purchases.paywalls;

import Z6.C1694a;
import Z6.j;
import android.graphics.Color;
import io.jentz.winter.js.HRHLwtyqJWz;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.t;
import o7.e;
import o7.f;
import o7.i;
import p116m7.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class PaywallColor {
    public static final Companion Companion = new Companion(null);
    private static final j rgbaColorRegex = new j("^#([A-Fa-f0-9]{8})$");
    private final int colorInt;
    private final String stringRepresentation;
    private final Color underlyingColor;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2633k abstractC2633k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int parseRGBAColor(String str) {
            if (!PaywallColor.rgbaColorRegex.d(str)) {
                return Color.parseColor(str);
            }
            String strSubstring = str.substring(1, 3);
            t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            int i8 = Integer.parseInt(strSubstring, C1694a.a(16));
            String strSubstring2 = str.substring(3, 5);
            t.f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            int i9 = Integer.parseInt(strSubstring2, C1694a.a(16));
            String strSubstring3 = str.substring(5, 7);
            t.f(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
            int i10 = Integer.parseInt(strSubstring3, C1694a.a(16));
            String strSubstring4 = str.substring(7, 9);
            t.f(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
            return Color.argb(Integer.parseInt(strSubstring4, C1694a.a(16)), i8, i9, i10);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Serializer implements b {
        public static final Serializer INSTANCE = new Serializer();
        private static final f descriptor = i.a("PaywallColor", e.i.f30979a);

        private Serializer() {
        }

        @Override // p116m7.b, p116m7.k, p116m7.a
        public f getDescriptor() {
            return descriptor;
        }

        @Override // p116m7.a
        public PaywallColor deserialize(p7.e decoder) {
            t.g(decoder, "decoder");
            return new PaywallColor(decoder.s());
        }

        @Override // p116m7.k
        public void serialize(p7.f encoder, PaywallColor value) {
            t.g(encoder, "encoder");
            t.g(value, "value");
            encoder.F(value.toString());
        }
    }

    public PaywallColor(String stringRepresentation, Color color) {
        t.g(stringRepresentation, "stringRepresentation");
        this.stringRepresentation = stringRepresentation;
        this.underlyingColor = color;
        this.colorInt = Companion.parseRGBAColor(stringRepresentation);
    }

    public static /* synthetic */ PaywallColor copy$default(PaywallColor paywallColor, String str, Color color, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = paywallColor.stringRepresentation;
        }
        if ((i8 & 2) != 0) {
            color = paywallColor.underlyingColor;
        }
        return paywallColor.copy(str, color);
    }

    public final String component1() {
        return this.stringRepresentation;
    }

    public final Color component2() {
        return this.underlyingColor;
    }

    public final PaywallColor copy(String stringRepresentation, Color color) {
        t.g(stringRepresentation, "stringRepresentation");
        return new PaywallColor(stringRepresentation, color);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallColor)) {
            return false;
        }
        PaywallColor paywallColor = (PaywallColor) obj;
        return t.c(this.stringRepresentation, paywallColor.stringRepresentation) && t.c(this.underlyingColor, paywallColor.underlyingColor);
    }

    public final int getColorInt() {
        return this.colorInt;
    }

    public final String getStringRepresentation() {
        return this.stringRepresentation;
    }

    public final Color getUnderlyingColor() {
        return this.underlyingColor;
    }

    public int hashCode() {
        int iHashCode = this.stringRepresentation.hashCode() * 31;
        Color color = this.underlyingColor;
        return iHashCode + (color == null ? 0 : color.hashCode());
    }

    public String toString() {
        return "PaywallColor(stringRepresentation=" + this.stringRepresentation + ", underlyingColor=" + this.underlyingColor + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallColor(String str) {
        this(str, Color.valueOf(Companion.parseRGBAColor(str)));
        t.g(str, HRHLwtyqJWz.ODOdHVptfo);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PaywallColor(int i8) {
        O o8 = O.f28784a;
        String str = String.format(Locale.US, "#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(16777215 & i8)}, 1));
        t.f(str, "format(locale, format, *args)");
        this(str, Color.valueOf(i8));
    }
}
