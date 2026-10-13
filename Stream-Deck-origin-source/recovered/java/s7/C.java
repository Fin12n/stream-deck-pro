package s7;

import C6.C0920i;
import I0.mIk.efuWFSeiT;
import p179u4.eubL.OjEsfyJYzbPn;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class C {
    public static final C2917y a(Number value, String key, String output) {
        kotlin.jvm.internal.t.g(value, "value");
        kotlin.jvm.internal.t.g(key, "key");
        kotlin.jvm.internal.t.g(output, "output");
        return e(-1, m(value, key, output));
    }

    public static final A c(Number value, String key, String output) {
        kotlin.jvm.internal.t.g(value, "value");
        kotlin.jvm.internal.t.g(key, "key");
        kotlin.jvm.internal.t.g(output, "output");
        return new A(m(value, key, output));
    }

    public static final A d(o7.f keyDescriptor) {
        kotlin.jvm.internal.t.g(keyDescriptor, "keyDescriptor");
        return new A("Value of type '" + keyDescriptor.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final C2917y f(int i8, String message, CharSequence input) {
        kotlin.jvm.internal.t.g(message, "message");
        kotlin.jvm.internal.t.g(input, "input");
        return e(i8, message + "\nJSON input: " + ((Object) j(input, i8)));
    }

    public static final C2917y g(String key, String input) {
        kotlin.jvm.internal.t.g(key, "key");
        kotlin.jvm.internal.t.g(input, "input");
        return e(-1, "Encountered an unknown key '" + key + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + ((Object) k(input, 0, 1, null)));
    }

    public static final Void h(AbstractC2894a abstractC2894a, String entity) {
        kotlin.jvm.internal.t.g(abstractC2894a, "<this>");
        kotlin.jvm.internal.t.g(entity, "entity");
        abstractC2894a.w("Trailing comma before the end of JSON " + entity, abstractC2894a.f33249a - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw new C0920i();
    }

    public static /* synthetic */ Void i(AbstractC2894a abstractC2894a, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = "object";
        }
        return h(abstractC2894a, str);
    }

    public static final CharSequence j(CharSequence charSequence, int i8) {
        kotlin.jvm.internal.t.g(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i8 != -1) {
                int i9 = i8 - 30;
                int i10 = i8 + 30;
                return (i9 <= 0 ? "" : ".....") + charSequence.subSequence(W6.n.d(i9, 0), W6.n.g(i10, charSequence.length())).toString() + (i10 >= charSequence.length() ? "" : ".....");
            }
            int length = charSequence.length() - 60;
            if (length > 0) {
                return "....." + charSequence.subSequence(length, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static /* synthetic */ CharSequence k(CharSequence charSequence, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = -1;
        }
        return j(charSequence, i8);
    }

    public static final Void l(AbstractC2894a abstractC2894a, Number result) {
        kotlin.jvm.internal.t.g(abstractC2894a, "<this>");
        kotlin.jvm.internal.t.g(result, "result");
        AbstractC2894a.x(abstractC2894a, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new C0920i();
    }

    public static final String m(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) k(str2, 0, 1, null));
    }

    public static final A b(Number number, String output) {
        kotlin.jvm.internal.t.g(number, efuWFSeiT.afR);
        kotlin.jvm.internal.t.g(output, "output");
        return new A("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) k(output, 0, 1, null)));
    }

    public static final C2917y e(int i8, String message) {
        kotlin.jvm.internal.t.g(message, "message");
        if (i8 >= 0) {
            message = "Unexpected JSON token at offset " + i8 + OjEsfyJYzbPn.ZobXBIRhCp + message;
        }
        return new C2917y(message);
    }
}
