package com.elgato.vsd2;

import D6.iIQ.BmWxZhjGfw;
import com.google.mlkit.common.internal.ckI.WqXA;
import com.google.protobuf.A;
import com.google.protobuf.AbstractC2086a;
import com.google.protobuf.AbstractC2097h;
import com.google.protobuf.AbstractC2098i;
import com.google.protobuf.C2106q;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.U;
import com.google.protobuf.g0;
import io.jentz.winter.js.HRHLwtyqJWz;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import p179u4.eubL.OjEsfyJYzbPn;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class Messages {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Action extends GeneratedMessageLite implements b {
        public static final int CATEGORY_FIELD_NUMBER = 4;
        private static final Action DEFAULT_INSTANCE;
        public static final int INDEX_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 3;
        private static volatile g0 PARSER = null;
        public static final int SHORTCUTID_FIELD_NUMBER = 5;
        public static final int TITLE_FIELD_NUMBER = 2;
        private int bitField0_;
        private int index_;
        private String title_ = "";
        private String name_ = "";
        private String category_ = "";
        private String shortcutID_ = "";

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements b {
            public a() {
                super(Action.DEFAULT_INSTANCE);
            }
        }

        static {
            Action action = new Action();
            DEFAULT_INSTANCE = action;
            GeneratedMessageLite.registerDefaultInstance(Action.class, action);
        }

        private Action() {
        }

        private void clearCategory() {
            this.category_ = getDefaultInstance().getCategory();
        }

        private void clearIndex() {
            this.index_ = 0;
        }

        private void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        private void clearShortcutID() {
            this.bitField0_ &= -2;
            this.shortcutID_ = getDefaultInstance().getShortcutID();
        }

        private void clearTitle() {
            this.title_ = getDefaultInstance().getTitle();
        }

        public static Action getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Action parseDelimitedFrom(InputStream inputStream) {
            return (Action) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Action parseFrom(ByteBuffer byteBuffer) {
            return (Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCategory(String str) {
            str.getClass();
            this.category_ = str;
        }

        private void setCategoryBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.category_ = abstractC2097h.T();
        }

        private void setIndex(int i8) {
            this.index_ = i8;
        }

        private void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        private void setNameBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.name_ = abstractC2097h.T();
        }

        private void setShortcutID(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.shortcutID_ = str;
        }

        private void setShortcutIDBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.shortcutID_ = abstractC2097h.T();
            this.bitField0_ |= 1;
        }

        private void setTitle(String str) {
            str.getClass();
            this.title_ = str;
        }

        private void setTitleBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.title_ = abstractC2097h.T();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new Action();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005ለ\u0000", new Object[]{"bitField0_", "index_", "title_", "name_", "category_", "shortcutID_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (Action.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getCategory() {
            return this.category_;
        }

        public AbstractC2097h getCategoryBytes() {
            return AbstractC2097h.E(this.category_);
        }

        public int getIndex() {
            return this.index_;
        }

        public String getName() {
            return this.name_;
        }

        public AbstractC2097h getNameBytes() {
            return AbstractC2097h.E(this.name_);
        }

        public String getShortcutID() {
            return this.shortcutID_;
        }

        public AbstractC2097h getShortcutIDBytes() {
            return AbstractC2097h.E(this.shortcutID_);
        }

        public String getTitle() {
            return this.title_;
        }

        public AbstractC2097h getTitleBytes() {
            return AbstractC2097h.E(this.title_);
        }

        public boolean hasShortcutID() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(Action action) {
            return (a) DEFAULT_INSTANCE.createBuilder(action);
        }

        public static Action parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (Action) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static Action parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static Action parseFrom(AbstractC2097h abstractC2097h) {
            return (Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static Action parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static Action parseFrom(byte[] bArr) {
            return (Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Action parseFrom(byte[] bArr, C2106q c2106q) {
            return (Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static Action parseFrom(InputStream inputStream) {
            return (Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Action parseFrom(InputStream inputStream, C2106q c2106q) {
            return (Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static Action parseFrom(AbstractC2098i abstractC2098i) {
            return (Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static Action parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class AssignShortcut extends GeneratedMessageLite implements U {
        private static final AssignShortcut DEFAULT_INSTANCE;
        public static final int INDEX_FIELD_NUMBER = 3;
        private static volatile g0 PARSER = null;
        public static final int PROFILEID_FIELD_NUMBER = 1;
        public static final int SHORTCUTID_FIELD_NUMBER = 2;
        private int index_;
        private String profileID_ = "";
        private String shortcutID_ = "";

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a() {
                super(AssignShortcut.DEFAULT_INSTANCE);
            }
        }

        static {
            AssignShortcut assignShortcut = new AssignShortcut();
            DEFAULT_INSTANCE = assignShortcut;
            GeneratedMessageLite.registerDefaultInstance(AssignShortcut.class, assignShortcut);
        }

        private AssignShortcut() {
        }

        private void clearIndex() {
            this.index_ = 0;
        }

        private void clearProfileID() {
            this.profileID_ = getDefaultInstance().getProfileID();
        }

        private void clearShortcutID() {
            this.shortcutID_ = getDefaultInstance().getShortcutID();
        }

        public static AssignShortcut getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static AssignShortcut parseDelimitedFrom(InputStream inputStream) {
            return (AssignShortcut) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AssignShortcut parseFrom(ByteBuffer byteBuffer) {
            return (AssignShortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setIndex(int i8) {
            this.index_ = i8;
        }

        private void setProfileID(String str) {
            str.getClass();
            this.profileID_ = str;
        }

        private void setProfileIDBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.profileID_ = abstractC2097h.T();
        }

        private void setShortcutID(String str) {
            str.getClass();
            this.shortcutID_ = str;
        }

        private void setShortcutIDBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.shortcutID_ = abstractC2097h.T();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new AssignShortcut();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b", new Object[]{"profileID_", "shortcutID_", "index_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (AssignShortcut.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getIndex() {
            return this.index_;
        }

        public String getProfileID() {
            return this.profileID_;
        }

        public AbstractC2097h getProfileIDBytes() {
            return AbstractC2097h.E(this.profileID_);
        }

        public String getShortcutID() {
            return this.shortcutID_;
        }

        public AbstractC2097h getShortcutIDBytes() {
            return AbstractC2097h.E(this.shortcutID_);
        }

        public static a newBuilder(AssignShortcut assignShortcut) {
            return (a) DEFAULT_INSTANCE.createBuilder(assignShortcut);
        }

        public static AssignShortcut parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (AssignShortcut) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static AssignShortcut parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (AssignShortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static AssignShortcut parseFrom(AbstractC2097h abstractC2097h) {
            return (AssignShortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static AssignShortcut parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (AssignShortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static AssignShortcut parseFrom(byte[] bArr) {
            return (AssignShortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AssignShortcut parseFrom(byte[] bArr, C2106q c2106q) {
            return (AssignShortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static AssignShortcut parseFrom(InputStream inputStream) {
            return (AssignShortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AssignShortcut parseFrom(InputStream inputStream, C2106q c2106q) {
            return (AssignShortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static AssignShortcut parseFrom(AbstractC2098i abstractC2098i) {
            return (AssignShortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static AssignShortcut parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (AssignShortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Authenticate extends GeneratedMessageLite implements U {
        private static final Authenticate DEFAULT_INSTANCE;
        private static volatile g0 PARSER = null;
        public static final int REQUESTID_FIELD_NUMBER = 1;
        private int requestID_;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a f(int i8) {
                copyOnWrite();
                ((Authenticate) this.instance).setRequestID(i8);
                return this;
            }

            public a() {
                super(Authenticate.DEFAULT_INSTANCE);
            }
        }

        static {
            Authenticate authenticate = new Authenticate();
            DEFAULT_INSTANCE = authenticate;
            GeneratedMessageLite.registerDefaultInstance(Authenticate.class, authenticate);
        }

        private Authenticate() {
        }

        private void clearRequestID() {
            this.requestID_ = 0;
        }

        public static Authenticate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Authenticate parseDelimitedFrom(InputStream inputStream) {
            return (Authenticate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Authenticate parseFrom(ByteBuffer byteBuffer) {
            return (Authenticate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequestID(int i8) {
            this.requestID_ = i8;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new Authenticate();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"requestID_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (Authenticate.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getRequestID() {
            return this.requestID_;
        }

        public static a newBuilder(Authenticate authenticate) {
            return (a) DEFAULT_INSTANCE.createBuilder(authenticate);
        }

        public static Authenticate parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (Authenticate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static Authenticate parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (Authenticate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static Authenticate parseFrom(AbstractC2097h abstractC2097h) {
            return (Authenticate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static Authenticate parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (Authenticate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static Authenticate parseFrom(byte[] bArr) {
            return (Authenticate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Authenticate parseFrom(byte[] bArr, C2106q c2106q) {
            return (Authenticate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static Authenticate parseFrom(InputStream inputStream) {
            return (Authenticate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Authenticate parseFrom(InputStream inputStream, C2106q c2106q) {
            return (Authenticate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static Authenticate parseFrom(AbstractC2098i abstractC2098i) {
            return (Authenticate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static Authenticate parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (Authenticate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class CancelAuthenticate extends GeneratedMessageLite implements U {
        private static final CancelAuthenticate DEFAULT_INSTANCE;
        private static volatile g0 PARSER = null;
        public static final int REQUESTID_FIELD_NUMBER = 1;
        private int requestID_;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a f(int i8) {
                copyOnWrite();
                ((CancelAuthenticate) this.instance).setRequestID(i8);
                return this;
            }

            public a() {
                super(CancelAuthenticate.DEFAULT_INSTANCE);
            }
        }

        static {
            CancelAuthenticate cancelAuthenticate = new CancelAuthenticate();
            DEFAULT_INSTANCE = cancelAuthenticate;
            GeneratedMessageLite.registerDefaultInstance(CancelAuthenticate.class, cancelAuthenticate);
        }

        private CancelAuthenticate() {
        }

        private void clearRequestID() {
            this.requestID_ = 0;
        }

        public static CancelAuthenticate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static CancelAuthenticate parseDelimitedFrom(InputStream inputStream) {
            return (CancelAuthenticate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CancelAuthenticate parseFrom(ByteBuffer byteBuffer) {
            return (CancelAuthenticate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequestID(int i8) {
            this.requestID_ = i8;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new CancelAuthenticate();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"requestID_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (CancelAuthenticate.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getRequestID() {
            return this.requestID_;
        }

        public static a newBuilder(CancelAuthenticate cancelAuthenticate) {
            return (a) DEFAULT_INSTANCE.createBuilder(cancelAuthenticate);
        }

        public static CancelAuthenticate parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (CancelAuthenticate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static CancelAuthenticate parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (CancelAuthenticate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static CancelAuthenticate parseFrom(AbstractC2097h abstractC2097h) {
            return (CancelAuthenticate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static CancelAuthenticate parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (CancelAuthenticate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static CancelAuthenticate parseFrom(byte[] bArr) {
            return (CancelAuthenticate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CancelAuthenticate parseFrom(byte[] bArr, C2106q c2106q) {
            return (CancelAuthenticate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static CancelAuthenticate parseFrom(InputStream inputStream) {
            return (CancelAuthenticate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CancelAuthenticate parseFrom(InputStream inputStream, C2106q c2106q) {
            return (CancelAuthenticate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static CancelAuthenticate parseFrom(AbstractC2098i abstractC2098i) {
            return (CancelAuthenticate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static CancelAuthenticate parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (CancelAuthenticate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class ClientCapabilities extends GeneratedMessageLite implements U {
        private static final ClientCapabilities DEFAULT_INSTANCE;
        public static final int ISUSERPRO_FIELD_NUMBER = 1;
        private static volatile g0 PARSER;
        private boolean isUserPro_;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a f(boolean z8) {
                copyOnWrite();
                ((ClientCapabilities) this.instance).setIsUserPro(z8);
                return this;
            }

            public a() {
                super(ClientCapabilities.DEFAULT_INSTANCE);
            }
        }

        static {
            ClientCapabilities clientCapabilities = new ClientCapabilities();
            DEFAULT_INSTANCE = clientCapabilities;
            GeneratedMessageLite.registerDefaultInstance(ClientCapabilities.class, clientCapabilities);
        }

        private ClientCapabilities() {
        }

        private void clearIsUserPro() {
            this.isUserPro_ = false;
        }

        public static ClientCapabilities getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static ClientCapabilities parseDelimitedFrom(InputStream inputStream) {
            return (ClientCapabilities) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientCapabilities parseFrom(ByteBuffer byteBuffer) {
            return (ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsUserPro(boolean z8) {
            this.isUserPro_ = z8;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new ClientCapabilities();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"isUserPro_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (ClientCapabilities.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public boolean getIsUserPro() {
            return this.isUserPro_;
        }

        public static a newBuilder(ClientCapabilities clientCapabilities) {
            return (a) DEFAULT_INSTANCE.createBuilder(clientCapabilities);
        }

        public static ClientCapabilities parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (ClientCapabilities) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static ClientCapabilities parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static ClientCapabilities parseFrom(AbstractC2097h abstractC2097h) {
            return (ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static ClientCapabilities parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static ClientCapabilities parseFrom(byte[] bArr) {
            return (ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ClientCapabilities parseFrom(byte[] bArr, C2106q c2106q) {
            return (ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static ClientCapabilities parseFrom(InputStream inputStream) {
            return (ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientCapabilities parseFrom(InputStream inputStream, C2106q c2106q) {
            return (ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static ClientCapabilities parseFrom(AbstractC2098i abstractC2098i) {
            return (ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static ClientCapabilities parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class ClientInformation extends GeneratedMessageLite implements U {
        private static final ClientInformation DEFAULT_INSTANCE;
        public static final int DEVICEMODEL_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OSNAME_FIELD_NUMBER = 5;
        public static final int OSVERSION_FIELD_NUMBER = 6;
        private static volatile g0 PARSER = null;
        public static final int PROTOCOLVERSION_FIELD_NUMBER = 3;
        public static final int USERAGENT_FIELD_NUMBER = 2;
        private int bitField0_;
        private int protocolVersion_;
        private String name_ = "";
        private String userAgent_ = "";
        private String deviceModel_ = "";
        private String osName_ = "";
        private String osVersion_ = "";

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a f(String str) {
                copyOnWrite();
                ((ClientInformation) this.instance).setDeviceModel(str);
                return this;
            }

            public a g(String str) {
                copyOnWrite();
                ((ClientInformation) this.instance).setName(str);
                return this;
            }

            public a h(String str) {
                copyOnWrite();
                ((ClientInformation) this.instance).setOsName(str);
                return this;
            }

            public a i(String str) {
                copyOnWrite();
                ((ClientInformation) this.instance).setOsVersion(str);
                return this;
            }

            public a k(int i8) {
                copyOnWrite();
                ((ClientInformation) this.instance).setProtocolVersion(i8);
                return this;
            }

            public a l(String str) {
                copyOnWrite();
                ((ClientInformation) this.instance).setUserAgent(str);
                return this;
            }

            public a() {
                super(ClientInformation.DEFAULT_INSTANCE);
            }
        }

        static {
            ClientInformation clientInformation = new ClientInformation();
            DEFAULT_INSTANCE = clientInformation;
            GeneratedMessageLite.registerDefaultInstance(ClientInformation.class, clientInformation);
        }

        private ClientInformation() {
        }

        private void clearDeviceModel() {
            this.bitField0_ &= -2;
            this.deviceModel_ = getDefaultInstance().getDeviceModel();
        }

        private void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        private void clearOsName() {
            this.bitField0_ &= -3;
            this.osName_ = getDefaultInstance().getOsName();
        }

        private void clearOsVersion() {
            this.bitField0_ &= -5;
            this.osVersion_ = getDefaultInstance().getOsVersion();
        }

        private void clearProtocolVersion() {
            this.protocolVersion_ = 0;
        }

        private void clearUserAgent() {
            this.userAgent_ = getDefaultInstance().getUserAgent();
        }

        public static ClientInformation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static ClientInformation parseDelimitedFrom(InputStream inputStream) {
            return (ClientInformation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientInformation parseFrom(ByteBuffer byteBuffer) {
            return (ClientInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceModel(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.deviceModel_ = str;
        }

        private void setDeviceModelBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.deviceModel_ = abstractC2097h.T();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        private void setNameBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.name_ = abstractC2097h.T();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsName(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.osName_ = str;
        }

        private void setOsNameBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.osName_ = abstractC2097h.T();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsVersion(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.osVersion_ = str;
        }

        private void setOsVersionBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.osVersion_ = abstractC2097h.T();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProtocolVersion(int i8) {
            this.protocolVersion_ = i8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserAgent(String str) {
            str.getClass();
            this.userAgent_ = str;
        }

        private void setUserAgentBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.userAgent_ = abstractC2097h.T();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new ClientInformation();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004ለ\u0000\u0005ለ\u0001\u0006ለ\u0002", new Object[]{"bitField0_", "name_", "userAgent_", "protocolVersion_", "deviceModel_", "osName_", "osVersion_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (ClientInformation.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getDeviceModel() {
            return this.deviceModel_;
        }

        public AbstractC2097h getDeviceModelBytes() {
            return AbstractC2097h.E(this.deviceModel_);
        }

        public String getName() {
            return this.name_;
        }

        public AbstractC2097h getNameBytes() {
            return AbstractC2097h.E(this.name_);
        }

        public String getOsName() {
            return this.osName_;
        }

        public AbstractC2097h getOsNameBytes() {
            return AbstractC2097h.E(this.osName_);
        }

        public String getOsVersion() {
            return this.osVersion_;
        }

        public AbstractC2097h getOsVersionBytes() {
            return AbstractC2097h.E(this.osVersion_);
        }

        public int getProtocolVersion() {
            return this.protocolVersion_;
        }

        public String getUserAgent() {
            return this.userAgent_;
        }

        public AbstractC2097h getUserAgentBytes() {
            return AbstractC2097h.E(this.userAgent_);
        }

        public boolean hasDeviceModel() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasOsName() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasOsVersion() {
            return (this.bitField0_ & 4) != 0;
        }

        public static a newBuilder(ClientInformation clientInformation) {
            return (a) DEFAULT_INSTANCE.createBuilder(clientInformation);
        }

        public static ClientInformation parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (ClientInformation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static ClientInformation parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (ClientInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static ClientInformation parseFrom(AbstractC2097h abstractC2097h) {
            return (ClientInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static ClientInformation parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (ClientInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static ClientInformation parseFrom(byte[] bArr) {
            return (ClientInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ClientInformation parseFrom(byte[] bArr, C2106q c2106q) {
            return (ClientInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static ClientInformation parseFrom(InputStream inputStream) {
            return (ClientInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientInformation parseFrom(InputStream inputStream, C2106q c2106q) {
            return (ClientInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static ClientInformation parseFrom(AbstractC2098i abstractC2098i) {
            return (ClientInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static ClientInformation parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (ClientInformation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class ClientMessage extends GeneratedMessageLite implements U {
        public static final int ASSIGNSHORTCUT_FIELD_NUMBER = 31;
        public static final int AUTHENTICATE_FIELD_NUMBER = 2;
        public static final int CANCELAUTHENTICATE_FIELD_NUMBER = 3;
        public static final int CLIENTCAPABILITIES_FIELD_NUMBER = 100;
        public static final int CREATEVIRTUALDEVICE_FIELD_NUMBER = 10;
        private static final ClientMessage DEFAULT_INSTANCE;
        public static final int DELETEVIRTUALDEVICE_FIELD_NUMBER = 12;
        public static final int HELLO_FIELD_NUMBER = 1;
        public static final int KEYPRESS_FIELD_NUMBER = 20;
        public static final int NEXTPAGE_FIELD_NUMBER = 21;
        public static final int OPENVIRTUALDEVICE_FIELD_NUMBER = 11;
        public static final int PAGEBYINDEX_FIELD_NUMBER = 23;
        private static volatile g0 PARSER = null;
        public static final int PREVIOUSPAGE_FIELD_NUMBER = 22;
        public static final int REMOVESHORTCUT_FIELD_NUMBER = 32;
        public static final int TRIGGERSHORTCUT_FIELD_NUMBER = 33;
        public static final int UPDATEKEYPADCONFIG_FIELD_NUMBER = 30;
        private int payloadCase_ = 0;
        private Object payload_;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a f(Authenticate.a aVar) {
                copyOnWrite();
                ((ClientMessage) this.instance).setAuthenticate((Authenticate) aVar.build());
                return this;
            }

            public a g(CancelAuthenticate.a aVar) {
                copyOnWrite();
                ((ClientMessage) this.instance).setCancelAuthenticate((CancelAuthenticate) aVar.build());
                return this;
            }

            public a h(ClientCapabilities clientCapabilities) {
                copyOnWrite();
                ((ClientMessage) this.instance).setClientCapabilities(clientCapabilities);
                return this;
            }

            public a i(CreateVirtualDevice.a aVar) {
                copyOnWrite();
                ((ClientMessage) this.instance).setCreateVirtualDevice((CreateVirtualDevice) aVar.build());
                return this;
            }

            public a k(DeleteVirtualDevice deleteVirtualDevice) {
                copyOnWrite();
                ((ClientMessage) this.instance).setDeleteVirtualDevice(deleteVirtualDevice);
                return this;
            }

            public a l(HelloFromClient.a aVar) {
                copyOnWrite();
                ((ClientMessage) this.instance).setHello((HelloFromClient) aVar.build());
                return this;
            }

            public a m(KeyPress.a aVar) {
                copyOnWrite();
                ((ClientMessage) this.instance).setKeyPress((KeyPress) aVar.build());
                return this;
            }

            public a n(NextPage nextPage) {
                copyOnWrite();
                ((ClientMessage) this.instance).setNextPage(nextPage);
                return this;
            }

            public a p(OpenVirtualDevice.a aVar) {
                copyOnWrite();
                ((ClientMessage) this.instance).setOpenVirtualDevice((OpenVirtualDevice) aVar.build());
                return this;
            }

            public a q(PreviousPage previousPage) {
                copyOnWrite();
                ((ClientMessage) this.instance).setPreviousPage(previousPage);
                return this;
            }

            public a r(UpdateKeypadConfig updateKeypadConfig) {
                copyOnWrite();
                ((ClientMessage) this.instance).setUpdateKeypadConfig(updateKeypadConfig);
                return this;
            }

            public a() {
                super(ClientMessage.DEFAULT_INSTANCE);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public enum b {
            HELLO(1),
            AUTHENTICATE(2),
            CANCELAUTHENTICATE(3),
            CREATEVIRTUALDEVICE(10),
            OPENVIRTUALDEVICE(11),
            DELETEVIRTUALDEVICE(12),
            KEYPRESS(20),
            NEXTPAGE(21),
            PREVIOUSPAGE(22),
            PAGEBYINDEX(23),
            UPDATEKEYPADCONFIG(30),
            ASSIGNSHORTCUT(31),
            REMOVESHORTCUT(32),
            TRIGGERSHORTCUT(33),
            CLIENTCAPABILITIES(100),
            PAYLOAD_NOT_SET(0);


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f17743a;

            b(int i8) {
                this.f17743a = i8;
            }

            public static b b(int i8) {
                if (i8 == 0) {
                    return PAYLOAD_NOT_SET;
                }
                if (i8 == 1) {
                    return HELLO;
                }
                if (i8 == 2) {
                    return AUTHENTICATE;
                }
                if (i8 == 3) {
                    return CANCELAUTHENTICATE;
                }
                if (i8 == 100) {
                    return CLIENTCAPABILITIES;
                }
                switch (i8) {
                    case 10:
                        return CREATEVIRTUALDEVICE;
                    case 11:
                        return OPENVIRTUALDEVICE;
                    case 12:
                        return DELETEVIRTUALDEVICE;
                    default:
                        switch (i8) {
                            case 20:
                                return KEYPRESS;
                            case 21:
                                return NEXTPAGE;
                            case ClientMessage.PREVIOUSPAGE_FIELD_NUMBER /* 22 */:
                                return PREVIOUSPAGE;
                            case ClientMessage.PAGEBYINDEX_FIELD_NUMBER /* 23 */:
                                return PAGEBYINDEX;
                            default:
                                switch (i8) {
                                    case 30:
                                        return UPDATEKEYPADCONFIG;
                                    case 31:
                                        return ASSIGNSHORTCUT;
                                    case 32:
                                        return REMOVESHORTCUT;
                                    case 33:
                                        return TRIGGERSHORTCUT;
                                    default:
                                        return null;
                                }
                        }
                }
            }
        }

        static {
            ClientMessage clientMessage = new ClientMessage();
            DEFAULT_INSTANCE = clientMessage;
            GeneratedMessageLite.registerDefaultInstance(ClientMessage.class, clientMessage);
        }

        private ClientMessage() {
        }

        private void clearAssignShortcut() {
            if (this.payloadCase_ == 31) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        private void clearAuthenticate() {
            if (this.payloadCase_ == 2) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        private void clearCancelAuthenticate() {
            if (this.payloadCase_ == 3) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        private void clearClientCapabilities() {
            if (this.payloadCase_ == 100) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        private void clearCreateVirtualDevice() {
            if (this.payloadCase_ == 10) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        private void clearDeleteVirtualDevice() {
            if (this.payloadCase_ == 12) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        private void clearHello() {
            if (this.payloadCase_ == 1) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        private void clearKeyPress() {
            if (this.payloadCase_ == 20) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        private void clearNextPage() {
            if (this.payloadCase_ == 21) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        private void clearOpenVirtualDevice() {
            if (this.payloadCase_ == 11) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        private void clearPageByIndex() {
            if (this.payloadCase_ == 23) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        private void clearPayload() {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }

        private void clearPreviousPage() {
            if (this.payloadCase_ == 22) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        private void clearRemoveShortcut() {
            if (this.payloadCase_ == 32) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        private void clearTriggerShortcut() {
            if (this.payloadCase_ == 33) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        private void clearUpdateKeypadConfig() {
            if (this.payloadCase_ == 30) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        public static ClientMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeAssignShortcut(AssignShortcut assignShortcut) {
            assignShortcut.getClass();
            if (this.payloadCase_ != 31 || this.payload_ == AssignShortcut.getDefaultInstance()) {
                this.payload_ = assignShortcut;
            } else {
                this.payload_ = ((AssignShortcut.a) AssignShortcut.newBuilder((AssignShortcut) this.payload_).mergeFrom((GeneratedMessageLite) assignShortcut)).buildPartial();
            }
            this.payloadCase_ = 31;
        }

        private void mergeAuthenticate(Authenticate authenticate) {
            authenticate.getClass();
            if (this.payloadCase_ != 2 || this.payload_ == Authenticate.getDefaultInstance()) {
                this.payload_ = authenticate;
            } else {
                this.payload_ = ((Authenticate.a) Authenticate.newBuilder((Authenticate) this.payload_).mergeFrom((GeneratedMessageLite) authenticate)).buildPartial();
            }
            this.payloadCase_ = 2;
        }

        private void mergeCancelAuthenticate(CancelAuthenticate cancelAuthenticate) {
            cancelAuthenticate.getClass();
            if (this.payloadCase_ != 3 || this.payload_ == CancelAuthenticate.getDefaultInstance()) {
                this.payload_ = cancelAuthenticate;
            } else {
                this.payload_ = ((CancelAuthenticate.a) CancelAuthenticate.newBuilder((CancelAuthenticate) this.payload_).mergeFrom((GeneratedMessageLite) cancelAuthenticate)).buildPartial();
            }
            this.payloadCase_ = 3;
        }

        private void mergeClientCapabilities(ClientCapabilities clientCapabilities) {
            clientCapabilities.getClass();
            if (this.payloadCase_ != 100 || this.payload_ == ClientCapabilities.getDefaultInstance()) {
                this.payload_ = clientCapabilities;
            } else {
                this.payload_ = ((ClientCapabilities.a) ClientCapabilities.newBuilder((ClientCapabilities) this.payload_).mergeFrom((GeneratedMessageLite) clientCapabilities)).buildPartial();
            }
            this.payloadCase_ = 100;
        }

        private void mergeCreateVirtualDevice(CreateVirtualDevice createVirtualDevice) {
            createVirtualDevice.getClass();
            if (this.payloadCase_ != 10 || this.payload_ == CreateVirtualDevice.getDefaultInstance()) {
                this.payload_ = createVirtualDevice;
            } else {
                this.payload_ = ((CreateVirtualDevice.a) CreateVirtualDevice.newBuilder((CreateVirtualDevice) this.payload_).mergeFrom((GeneratedMessageLite) createVirtualDevice)).buildPartial();
            }
            this.payloadCase_ = 10;
        }

        private void mergeDeleteVirtualDevice(DeleteVirtualDevice deleteVirtualDevice) {
            deleteVirtualDevice.getClass();
            if (this.payloadCase_ != 12 || this.payload_ == DeleteVirtualDevice.getDefaultInstance()) {
                this.payload_ = deleteVirtualDevice;
            } else {
                this.payload_ = ((DeleteVirtualDevice.a) DeleteVirtualDevice.newBuilder((DeleteVirtualDevice) this.payload_).mergeFrom((GeneratedMessageLite) deleteVirtualDevice)).buildPartial();
            }
            this.payloadCase_ = 12;
        }

        private void mergeHello(HelloFromClient helloFromClient) {
            helloFromClient.getClass();
            if (this.payloadCase_ != 1 || this.payload_ == HelloFromClient.getDefaultInstance()) {
                this.payload_ = helloFromClient;
            } else {
                this.payload_ = ((HelloFromClient.a) HelloFromClient.newBuilder((HelloFromClient) this.payload_).mergeFrom((GeneratedMessageLite) helloFromClient)).buildPartial();
            }
            this.payloadCase_ = 1;
        }

        private void mergeKeyPress(KeyPress keyPress) {
            keyPress.getClass();
            if (this.payloadCase_ != 20 || this.payload_ == KeyPress.getDefaultInstance()) {
                this.payload_ = keyPress;
            } else {
                this.payload_ = ((KeyPress.a) KeyPress.newBuilder((KeyPress) this.payload_).mergeFrom((GeneratedMessageLite) keyPress)).buildPartial();
            }
            this.payloadCase_ = 20;
        }

        private void mergeNextPage(NextPage nextPage) {
            nextPage.getClass();
            if (this.payloadCase_ != 21 || this.payload_ == NextPage.getDefaultInstance()) {
                this.payload_ = nextPage;
            } else {
                this.payload_ = ((NextPage.a) NextPage.newBuilder((NextPage) this.payload_).mergeFrom((GeneratedMessageLite) nextPage)).buildPartial();
            }
            this.payloadCase_ = 21;
        }

        private void mergeOpenVirtualDevice(OpenVirtualDevice openVirtualDevice) {
            openVirtualDevice.getClass();
            if (this.payloadCase_ != 11 || this.payload_ == OpenVirtualDevice.getDefaultInstance()) {
                this.payload_ = openVirtualDevice;
            } else {
                this.payload_ = ((OpenVirtualDevice.a) OpenVirtualDevice.newBuilder((OpenVirtualDevice) this.payload_).mergeFrom((GeneratedMessageLite) openVirtualDevice)).buildPartial();
            }
            this.payloadCase_ = 11;
        }

        private void mergePageByIndex(PageByIndex pageByIndex) {
            pageByIndex.getClass();
            if (this.payloadCase_ != 23 || this.payload_ == PageByIndex.getDefaultInstance()) {
                this.payload_ = pageByIndex;
            } else {
                this.payload_ = ((PageByIndex.a) PageByIndex.newBuilder((PageByIndex) this.payload_).mergeFrom((GeneratedMessageLite) pageByIndex)).buildPartial();
            }
            this.payloadCase_ = 23;
        }

        private void mergePreviousPage(PreviousPage previousPage) {
            previousPage.getClass();
            if (this.payloadCase_ != 22 || this.payload_ == PreviousPage.getDefaultInstance()) {
                this.payload_ = previousPage;
            } else {
                this.payload_ = ((PreviousPage.a) PreviousPage.newBuilder((PreviousPage) this.payload_).mergeFrom((GeneratedMessageLite) previousPage)).buildPartial();
            }
            this.payloadCase_ = 22;
        }

        private void mergeRemoveShortcut(RemoveShortcut removeShortcut) {
            removeShortcut.getClass();
            if (this.payloadCase_ != 32 || this.payload_ == RemoveShortcut.getDefaultInstance()) {
                this.payload_ = removeShortcut;
            } else {
                this.payload_ = ((RemoveShortcut.a) RemoveShortcut.newBuilder((RemoveShortcut) this.payload_).mergeFrom((GeneratedMessageLite) removeShortcut)).buildPartial();
            }
            this.payloadCase_ = 32;
        }

        private void mergeTriggerShortcut(TriggerShortcut triggerShortcut) {
            triggerShortcut.getClass();
            if (this.payloadCase_ != 33 || this.payload_ == TriggerShortcut.getDefaultInstance()) {
                this.payload_ = triggerShortcut;
            } else {
                this.payload_ = ((TriggerShortcut.a) TriggerShortcut.newBuilder((TriggerShortcut) this.payload_).mergeFrom((GeneratedMessageLite) triggerShortcut)).buildPartial();
            }
            this.payloadCase_ = 33;
        }

        private void mergeUpdateKeypadConfig(UpdateKeypadConfig updateKeypadConfig) {
            updateKeypadConfig.getClass();
            if (this.payloadCase_ != 30 || this.payload_ == UpdateKeypadConfig.getDefaultInstance()) {
                this.payload_ = updateKeypadConfig;
            } else {
                this.payload_ = ((UpdateKeypadConfig.a) UpdateKeypadConfig.newBuilder((UpdateKeypadConfig) this.payload_).mergeFrom((GeneratedMessageLite) updateKeypadConfig)).buildPartial();
            }
            this.payloadCase_ = 30;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static ClientMessage parseDelimitedFrom(InputStream inputStream) {
            return (ClientMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientMessage parseFrom(ByteBuffer byteBuffer) {
            return (ClientMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAssignShortcut(AssignShortcut assignShortcut) {
            assignShortcut.getClass();
            this.payload_ = assignShortcut;
            this.payloadCase_ = 31;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuthenticate(Authenticate authenticate) {
            authenticate.getClass();
            this.payload_ = authenticate;
            this.payloadCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCancelAuthenticate(CancelAuthenticate cancelAuthenticate) {
            cancelAuthenticate.getClass();
            this.payload_ = cancelAuthenticate;
            this.payloadCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientCapabilities(ClientCapabilities clientCapabilities) {
            clientCapabilities.getClass();
            this.payload_ = clientCapabilities;
            this.payloadCase_ = 100;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreateVirtualDevice(CreateVirtualDevice createVirtualDevice) {
            createVirtualDevice.getClass();
            this.payload_ = createVirtualDevice;
            this.payloadCase_ = 10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeleteVirtualDevice(DeleteVirtualDevice deleteVirtualDevice) {
            deleteVirtualDevice.getClass();
            this.payload_ = deleteVirtualDevice;
            this.payloadCase_ = 12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHello(HelloFromClient helloFromClient) {
            helloFromClient.getClass();
            this.payload_ = helloFromClient;
            this.payloadCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeyPress(KeyPress keyPress) {
            keyPress.getClass();
            this.payload_ = keyPress;
            this.payloadCase_ = 20;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNextPage(NextPage nextPage) {
            nextPage.getClass();
            this.payload_ = nextPage;
            this.payloadCase_ = 21;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpenVirtualDevice(OpenVirtualDevice openVirtualDevice) {
            openVirtualDevice.getClass();
            this.payload_ = openVirtualDevice;
            this.payloadCase_ = 11;
        }

        private void setPageByIndex(PageByIndex pageByIndex) {
            pageByIndex.getClass();
            this.payload_ = pageByIndex;
            this.payloadCase_ = 23;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPreviousPage(PreviousPage previousPage) {
            previousPage.getClass();
            this.payload_ = previousPage;
            this.payloadCase_ = 22;
        }

        private void setRemoveShortcut(RemoveShortcut removeShortcut) {
            removeShortcut.getClass();
            this.payload_ = removeShortcut;
            this.payloadCase_ = 32;
        }

        private void setTriggerShortcut(TriggerShortcut triggerShortcut) {
            triggerShortcut.getClass();
            this.payload_ = triggerShortcut;
            this.payloadCase_ = 33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdateKeypadConfig(UpdateKeypadConfig updateKeypadConfig) {
            updateKeypadConfig.getClass();
            this.payload_ = updateKeypadConfig;
            this.payloadCase_ = 30;
        }

        public AssignShortcut getAssignShortcut() {
            return this.payloadCase_ == 31 ? (AssignShortcut) this.payload_ : AssignShortcut.getDefaultInstance();
        }

        public Authenticate getAuthenticate() {
            return this.payloadCase_ == 2 ? (Authenticate) this.payload_ : Authenticate.getDefaultInstance();
        }

        public CancelAuthenticate getCancelAuthenticate() {
            return this.payloadCase_ == 3 ? (CancelAuthenticate) this.payload_ : CancelAuthenticate.getDefaultInstance();
        }

        public ClientCapabilities getClientCapabilities() {
            return this.payloadCase_ == 100 ? (ClientCapabilities) this.payload_ : ClientCapabilities.getDefaultInstance();
        }

        public CreateVirtualDevice getCreateVirtualDevice() {
            return this.payloadCase_ == 10 ? (CreateVirtualDevice) this.payload_ : CreateVirtualDevice.getDefaultInstance();
        }

        public DeleteVirtualDevice getDeleteVirtualDevice() {
            return this.payloadCase_ == 12 ? (DeleteVirtualDevice) this.payload_ : DeleteVirtualDevice.getDefaultInstance();
        }

        public HelloFromClient getHello() {
            return this.payloadCase_ == 1 ? (HelloFromClient) this.payload_ : HelloFromClient.getDefaultInstance();
        }

        public KeyPress getKeyPress() {
            return this.payloadCase_ == 20 ? (KeyPress) this.payload_ : KeyPress.getDefaultInstance();
        }

        public NextPage getNextPage() {
            return this.payloadCase_ == 21 ? (NextPage) this.payload_ : NextPage.getDefaultInstance();
        }

        public OpenVirtualDevice getOpenVirtualDevice() {
            return this.payloadCase_ == 11 ? (OpenVirtualDevice) this.payload_ : OpenVirtualDevice.getDefaultInstance();
        }

        public PageByIndex getPageByIndex() {
            return this.payloadCase_ == 23 ? (PageByIndex) this.payload_ : PageByIndex.getDefaultInstance();
        }

        public b getPayloadCase() {
            return b.b(this.payloadCase_);
        }

        public PreviousPage getPreviousPage() {
            return this.payloadCase_ == 22 ? (PreviousPage) this.payload_ : PreviousPage.getDefaultInstance();
        }

        public RemoveShortcut getRemoveShortcut() {
            return this.payloadCase_ == 32 ? (RemoveShortcut) this.payload_ : RemoveShortcut.getDefaultInstance();
        }

        public TriggerShortcut getTriggerShortcut() {
            return this.payloadCase_ == 33 ? (TriggerShortcut) this.payload_ : TriggerShortcut.getDefaultInstance();
        }

        public UpdateKeypadConfig getUpdateKeypadConfig() {
            return this.payloadCase_ == 30 ? (UpdateKeypadConfig) this.payload_ : UpdateKeypadConfig.getDefaultInstance();
        }

        public boolean hasAssignShortcut() {
            return this.payloadCase_ == 31;
        }

        public boolean hasAuthenticate() {
            return this.payloadCase_ == 2;
        }

        public boolean hasCancelAuthenticate() {
            return this.payloadCase_ == 3;
        }

        public boolean hasClientCapabilities() {
            return this.payloadCase_ == 100;
        }

        public boolean hasCreateVirtualDevice() {
            return this.payloadCase_ == 10;
        }

        public boolean hasDeleteVirtualDevice() {
            return this.payloadCase_ == 12;
        }

        public boolean hasHello() {
            return this.payloadCase_ == 1;
        }

        public boolean hasKeyPress() {
            return this.payloadCase_ == 20;
        }

        public boolean hasNextPage() {
            return this.payloadCase_ == 21;
        }

        public boolean hasOpenVirtualDevice() {
            return this.payloadCase_ == 11;
        }

        public boolean hasPageByIndex() {
            return this.payloadCase_ == 23;
        }

        public boolean hasPreviousPage() {
            return this.payloadCase_ == 22;
        }

        public boolean hasRemoveShortcut() {
            return this.payloadCase_ == 32;
        }

        public boolean hasTriggerShortcut() {
            return this.payloadCase_ == 33;
        }

        public boolean hasUpdateKeypadConfig() {
            return this.payloadCase_ == 30;
        }

        public static a newBuilder(ClientMessage clientMessage) {
            return (a) DEFAULT_INSTANCE.createBuilder(clientMessage);
        }

        public static ClientMessage parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (ClientMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static ClientMessage parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (ClientMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new ClientMessage();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0001\u0000\u0001d\u000f\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\n<\u0000\u000b<\u0000\f<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0017<\u0000\u001e<\u0000\u001f<\u0000 <\u0000!<\u0000d<\u0000", new Object[]{BmWxZhjGfw.DBUD, "payloadCase_", HelloFromClient.class, Authenticate.class, CancelAuthenticate.class, CreateVirtualDevice.class, OpenVirtualDevice.class, DeleteVirtualDevice.class, KeyPress.class, NextPage.class, PreviousPage.class, PageByIndex.class, UpdateKeypadConfig.class, AssignShortcut.class, RemoveShortcut.class, TriggerShortcut.class, ClientCapabilities.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (ClientMessage.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static ClientMessage parseFrom(AbstractC2097h abstractC2097h) {
            return (ClientMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static ClientMessage parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (ClientMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static ClientMessage parseFrom(byte[] bArr) {
            return (ClientMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ClientMessage parseFrom(byte[] bArr, C2106q c2106q) {
            return (ClientMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static ClientMessage parseFrom(InputStream inputStream) {
            return (ClientMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientMessage parseFrom(InputStream inputStream, C2106q c2106q) {
            return (ClientMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static ClientMessage parseFrom(AbstractC2098i abstractC2098i) {
            return (ClientMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static ClientMessage parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (ClientMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Context extends GeneratedMessageLite implements U {
        public static final int ACTIONS_FIELD_NUMBER = 4;
        public static final int CURRENTPAGE_FIELD_NUMBER = 3;
        private static final Context DEFAULT_INSTANCE;
        private static volatile g0 PARSER = null;
        public static final int PROFILEID_FIELD_NUMBER = 1;
        public static final int TOTALPAGES_FIELD_NUMBER = 2;
        private int currentPage_;
        private int totalPages_;
        private String profileID_ = "";
        private A.j actions_ = GeneratedMessageLite.emptyProtobufList();

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a() {
                super(Context.DEFAULT_INSTANCE);
            }
        }

        static {
            Context context = new Context();
            DEFAULT_INSTANCE = context;
            GeneratedMessageLite.registerDefaultInstance(Context.class, context);
        }

        private Context() {
        }

        private void addActions(Action action) {
            action.getClass();
            ensureActionsIsMutable();
            this.actions_.add(action);
        }

        private void addAllActions(Iterable<? extends Action> iterable) {
            ensureActionsIsMutable();
            AbstractC2086a.addAll((Iterable) iterable, (List) this.actions_);
        }

        private void clearActions() {
            this.actions_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearCurrentPage() {
            this.currentPage_ = 0;
        }

        private void clearProfileID() {
            this.profileID_ = getDefaultInstance().getProfileID();
        }

        private void clearTotalPages() {
            this.totalPages_ = 0;
        }

        private void ensureActionsIsMutable() {
            A.j jVar = this.actions_;
            if (jVar.C()) {
                return;
            }
            this.actions_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        public static Context getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Context parseDelimitedFrom(InputStream inputStream) {
            return (Context) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Context parseFrom(ByteBuffer byteBuffer) {
            return (Context) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeActions(int i8) {
            ensureActionsIsMutable();
            this.actions_.remove(i8);
        }

        private void setActions(int i8, Action action) {
            action.getClass();
            ensureActionsIsMutable();
            this.actions_.set(i8, action);
        }

        private void setCurrentPage(int i8) {
            this.currentPage_ = i8;
        }

        private void setProfileID(String str) {
            str.getClass();
            this.profileID_ = str;
        }

        private void setProfileIDBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.profileID_ = abstractC2097h.T();
        }

        private void setTotalPages(int i8) {
            this.totalPages_ = i8;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new Context();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u000b\u0003\u000b\u0004\u001b", new Object[]{"profileID_", "totalPages_", "currentPage_", "actions_", Action.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (Context.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public Action getActions(int i8) {
            return (Action) this.actions_.get(i8);
        }

        public int getActionsCount() {
            return this.actions_.size();
        }

        public List<Action> getActionsList() {
            return this.actions_;
        }

        public b getActionsOrBuilder(int i8) {
            return (b) this.actions_.get(i8);
        }

        public List<? extends b> getActionsOrBuilderList() {
            return this.actions_;
        }

        public int getCurrentPage() {
            return this.currentPage_;
        }

        public String getProfileID() {
            return this.profileID_;
        }

        public AbstractC2097h getProfileIDBytes() {
            return AbstractC2097h.E(this.profileID_);
        }

        public int getTotalPages() {
            return this.totalPages_;
        }

        public static a newBuilder(Context context) {
            return (a) DEFAULT_INSTANCE.createBuilder(context);
        }

        public static Context parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (Context) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static Context parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (Context) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static Context parseFrom(AbstractC2097h abstractC2097h) {
            return (Context) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        private void addActions(int i8, Action action) {
            action.getClass();
            ensureActionsIsMutable();
            this.actions_.add(i8, action);
        }

        public static Context parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (Context) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static Context parseFrom(byte[] bArr) {
            return (Context) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Context parseFrom(byte[] bArr, C2106q c2106q) {
            return (Context) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static Context parseFrom(InputStream inputStream) {
            return (Context) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Context parseFrom(InputStream inputStream, C2106q c2106q) {
            return (Context) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static Context parseFrom(AbstractC2098i abstractC2098i) {
            return (Context) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static Context parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (Context) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class ContextUpdate extends GeneratedMessageLite implements U {
        private static final ContextUpdate DEFAULT_INSTANCE;
        private static volatile g0 PARSER = null;
        public static final int PROFILEID_FIELD_NUMBER = 1;
        public static final int REMOVE_FIELD_NUMBER = 3;
        public static final int REPLACE_FIELD_NUMBER = 2;
        private int removeMemoizedSerializedSize = -1;
        private String profileID_ = "";
        private A.j replace_ = GeneratedMessageLite.emptyProtobufList();
        private A.g remove_ = GeneratedMessageLite.emptyIntList();

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a() {
                super(ContextUpdate.DEFAULT_INSTANCE);
            }
        }

        static {
            ContextUpdate contextUpdate = new ContextUpdate();
            DEFAULT_INSTANCE = contextUpdate;
            GeneratedMessageLite.registerDefaultInstance(ContextUpdate.class, contextUpdate);
        }

        private ContextUpdate() {
        }

        private void addAllRemove(Iterable<? extends Integer> iterable) {
            ensureRemoveIsMutable();
            AbstractC2086a.addAll((Iterable) iterable, (List) this.remove_);
        }

        private void addAllReplace(Iterable<? extends Action> iterable) {
            ensureReplaceIsMutable();
            AbstractC2086a.addAll((Iterable) iterable, (List) this.replace_);
        }

        private void addRemove(int i8) {
            ensureRemoveIsMutable();
            this.remove_.l(i8);
        }

        private void addReplace(Action action) {
            action.getClass();
            ensureReplaceIsMutable();
            this.replace_.add(action);
        }

        private void clearProfileID() {
            this.profileID_ = getDefaultInstance().getProfileID();
        }

        private void clearRemove() {
            this.remove_ = GeneratedMessageLite.emptyIntList();
        }

        private void clearReplace() {
            this.replace_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureRemoveIsMutable() {
            A.g gVar = this.remove_;
            if (gVar.C()) {
                return;
            }
            this.remove_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureReplaceIsMutable() {
            A.j jVar = this.replace_;
            if (jVar.C()) {
                return;
            }
            this.replace_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        public static ContextUpdate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static ContextUpdate parseDelimitedFrom(InputStream inputStream) {
            return (ContextUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContextUpdate parseFrom(ByteBuffer byteBuffer) {
            return (ContextUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeReplace(int i8) {
            ensureReplaceIsMutable();
            this.replace_.remove(i8);
        }

        private void setProfileID(String str) {
            str.getClass();
            this.profileID_ = str;
        }

        private void setProfileIDBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.profileID_ = abstractC2097h.T();
        }

        private void setRemove(int i8, int i9) {
            ensureRemoveIsMutable();
            this.remove_.h(i8, i9);
        }

        private void setReplace(int i8, Action action) {
            action.getClass();
            ensureReplaceIsMutable();
            this.replace_.set(i8, action);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new ContextUpdate();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003+", new Object[]{"profileID_", "replace_", Action.class, "remove_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (ContextUpdate.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getProfileID() {
            return this.profileID_;
        }

        public AbstractC2097h getProfileIDBytes() {
            return AbstractC2097h.E(this.profileID_);
        }

        public int getRemove(int i8) {
            return this.remove_.getInt(i8);
        }

        public int getRemoveCount() {
            return this.remove_.size();
        }

        public List<Integer> getRemoveList() {
            return this.remove_;
        }

        public Action getReplace(int i8) {
            return (Action) this.replace_.get(i8);
        }

        public int getReplaceCount() {
            return this.replace_.size();
        }

        public List<Action> getReplaceList() {
            return this.replace_;
        }

        public b getReplaceOrBuilder(int i8) {
            return (b) this.replace_.get(i8);
        }

        public List<? extends b> getReplaceOrBuilderList() {
            return this.replace_;
        }

        public static a newBuilder(ContextUpdate contextUpdate) {
            return (a) DEFAULT_INSTANCE.createBuilder(contextUpdate);
        }

        public static ContextUpdate parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (ContextUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static ContextUpdate parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (ContextUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static ContextUpdate parseFrom(AbstractC2097h abstractC2097h) {
            return (ContextUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        private void addReplace(int i8, Action action) {
            action.getClass();
            ensureReplaceIsMutable();
            this.replace_.add(i8, action);
        }

        public static ContextUpdate parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (ContextUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static ContextUpdate parseFrom(byte[] bArr) {
            return (ContextUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ContextUpdate parseFrom(byte[] bArr, C2106q c2106q) {
            return (ContextUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static ContextUpdate parseFrom(InputStream inputStream) {
            return (ContextUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContextUpdate parseFrom(InputStream inputStream, C2106q c2106q) {
            return (ContextUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static ContextUpdate parseFrom(AbstractC2098i abstractC2098i) {
            return (ContextUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static ContextUpdate parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (ContextUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class CreateVirtualDevice extends GeneratedMessageLite implements U {
        private static final CreateVirtualDevice DEFAULT_INSTANCE;
        public static final int KEYPADCONFIG_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile g0 PARSER = null;
        public static final int REQUESTID_FIELD_NUMBER = 1;
        public static final int SKIPUNIQUENESSOFNAMEVALIDATION_FIELD_NUMBER = 4;
        private int bitField0_;
        private KeypadConfig keypadConfig_;
        private String name_ = "";
        private int requestID_;
        private boolean skipUniquenessOfNameValidation_;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a f(KeypadConfig keypadConfig) {
                copyOnWrite();
                ((CreateVirtualDevice) this.instance).setKeypadConfig(keypadConfig);
                return this;
            }

            public a g(String str) {
                copyOnWrite();
                ((CreateVirtualDevice) this.instance).setName(str);
                return this;
            }

            public a h(int i8) {
                copyOnWrite();
                ((CreateVirtualDevice) this.instance).setRequestID(i8);
                return this;
            }

            public a i(boolean z8) {
                copyOnWrite();
                ((CreateVirtualDevice) this.instance).setSkipUniquenessOfNameValidation(z8);
                return this;
            }

            public a() {
                super(CreateVirtualDevice.DEFAULT_INSTANCE);
            }
        }

        static {
            CreateVirtualDevice createVirtualDevice = new CreateVirtualDevice();
            DEFAULT_INSTANCE = createVirtualDevice;
            GeneratedMessageLite.registerDefaultInstance(CreateVirtualDevice.class, createVirtualDevice);
        }

        private CreateVirtualDevice() {
        }

        private void clearKeypadConfig() {
            this.keypadConfig_ = null;
            this.bitField0_ &= -2;
        }

        private void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        private void clearRequestID() {
            this.requestID_ = 0;
        }

        private void clearSkipUniquenessOfNameValidation() {
            this.skipUniquenessOfNameValidation_ = false;
        }

        public static CreateVirtualDevice getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeKeypadConfig(KeypadConfig keypadConfig) {
            keypadConfig.getClass();
            KeypadConfig keypadConfig2 = this.keypadConfig_;
            if (keypadConfig2 == null || keypadConfig2 == KeypadConfig.getDefaultInstance()) {
                this.keypadConfig_ = keypadConfig;
            } else {
                this.keypadConfig_ = (KeypadConfig) ((KeypadConfig.b) KeypadConfig.newBuilder(this.keypadConfig_).mergeFrom((GeneratedMessageLite) keypadConfig)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static CreateVirtualDevice parseDelimitedFrom(InputStream inputStream) {
            return (CreateVirtualDevice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CreateVirtualDevice parseFrom(ByteBuffer byteBuffer) {
            return (CreateVirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeypadConfig(KeypadConfig keypadConfig) {
            keypadConfig.getClass();
            this.keypadConfig_ = keypadConfig;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        private void setNameBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.name_ = abstractC2097h.T();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequestID(int i8) {
            this.requestID_ = i8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkipUniquenessOfNameValidation(boolean z8) {
            this.skipUniquenessOfNameValidation_ = z8;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new CreateVirtualDevice();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002Ȉ\u0003ဉ\u0000\u0004\u0007", new Object[]{"bitField0_", "requestID_", "name_", "keypadConfig_", "skipUniquenessOfNameValidation_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (CreateVirtualDevice.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public KeypadConfig getKeypadConfig() {
            KeypadConfig keypadConfig = this.keypadConfig_;
            return keypadConfig == null ? KeypadConfig.getDefaultInstance() : keypadConfig;
        }

        public String getName() {
            return this.name_;
        }

        public AbstractC2097h getNameBytes() {
            return AbstractC2097h.E(this.name_);
        }

        public int getRequestID() {
            return this.requestID_;
        }

        public boolean getSkipUniquenessOfNameValidation() {
            return this.skipUniquenessOfNameValidation_;
        }

        public boolean hasKeypadConfig() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(CreateVirtualDevice createVirtualDevice) {
            return (a) DEFAULT_INSTANCE.createBuilder(createVirtualDevice);
        }

        public static CreateVirtualDevice parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (CreateVirtualDevice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static CreateVirtualDevice parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (CreateVirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static CreateVirtualDevice parseFrom(AbstractC2097h abstractC2097h) {
            return (CreateVirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static CreateVirtualDevice parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (CreateVirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static CreateVirtualDevice parseFrom(byte[] bArr) {
            return (CreateVirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CreateVirtualDevice parseFrom(byte[] bArr, C2106q c2106q) {
            return (CreateVirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static CreateVirtualDevice parseFrom(InputStream inputStream) {
            return (CreateVirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CreateVirtualDevice parseFrom(InputStream inputStream, C2106q c2106q) {
            return (CreateVirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static CreateVirtualDevice parseFrom(AbstractC2098i abstractC2098i) {
            return (CreateVirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static CreateVirtualDevice parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (CreateVirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class DeleteVirtualDevice extends GeneratedMessageLite implements U {
        private static final DeleteVirtualDevice DEFAULT_INSTANCE;
        private static volatile g0 PARSER;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a() {
                super(DeleteVirtualDevice.DEFAULT_INSTANCE);
            }
        }

        static {
            DeleteVirtualDevice deleteVirtualDevice = new DeleteVirtualDevice();
            DEFAULT_INSTANCE = deleteVirtualDevice;
            GeneratedMessageLite.registerDefaultInstance(DeleteVirtualDevice.class, deleteVirtualDevice);
        }

        private DeleteVirtualDevice() {
        }

        public static DeleteVirtualDevice getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static DeleteVirtualDevice parseDelimitedFrom(InputStream inputStream) {
            return (DeleteVirtualDevice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeleteVirtualDevice parseFrom(ByteBuffer byteBuffer) {
            return (DeleteVirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new DeleteVirtualDevice();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (DeleteVirtualDevice.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static a newBuilder(DeleteVirtualDevice deleteVirtualDevice) {
            return (a) DEFAULT_INSTANCE.createBuilder(deleteVirtualDevice);
        }

        public static DeleteVirtualDevice parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (DeleteVirtualDevice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static DeleteVirtualDevice parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (DeleteVirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static DeleteVirtualDevice parseFrom(AbstractC2097h abstractC2097h) {
            return (DeleteVirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static DeleteVirtualDevice parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (DeleteVirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static DeleteVirtualDevice parseFrom(byte[] bArr) {
            return (DeleteVirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DeleteVirtualDevice parseFrom(byte[] bArr, C2106q c2106q) {
            return (DeleteVirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static DeleteVirtualDevice parseFrom(InputStream inputStream) {
            return (DeleteVirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeleteVirtualDevice parseFrom(InputStream inputStream, C2106q c2106q) {
            return (DeleteVirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static DeleteVirtualDevice parseFrom(AbstractC2098i abstractC2098i) {
            return (DeleteVirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static DeleteVirtualDevice parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (DeleteVirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Error extends GeneratedMessageLite implements U {
        public static final int CODE_FIELD_NUMBER = 2;
        private static final Error DEFAULT_INSTANCE;
        private static volatile g0 PARSER = null;
        public static final int REASON_FIELD_NUMBER = 3;
        public static final int REQUESTID_FIELD_NUMBER = 1;
        private int bitField0_;
        private int code_;
        private String reason_ = "";
        private int requestID_;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a() {
                super(Error.DEFAULT_INSTANCE);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public enum b implements A.c {
            DeviceNotFound(0),
            DeviceNameAlreadyTaken(1),
            ResourceLimitReached(2),
            AuthenticationRejected(3),
            Cancelled(4),
            InvalidState(5),
            UNRECOGNIZED(-1);


            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final A.d f17751i = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f17753a;

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public class a implements A.d {
                @Override // com.google.protobuf.A.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public b findValueByNumber(int i8) {
                    return b.b(i8);
                }
            }

            b(int i8) {
                this.f17753a = i8;
            }

            public static b b(int i8) {
                if (i8 == 0) {
                    return DeviceNotFound;
                }
                if (i8 == 1) {
                    return DeviceNameAlreadyTaken;
                }
                if (i8 == 2) {
                    return ResourceLimitReached;
                }
                if (i8 == 3) {
                    return AuthenticationRejected;
                }
                if (i8 == 4) {
                    return Cancelled;
                }
                if (i8 != 5) {
                    return null;
                }
                return InvalidState;
            }

            @Override // com.google.protobuf.A.c
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f17753a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            Error error = new Error();
            DEFAULT_INSTANCE = error;
            GeneratedMessageLite.registerDefaultInstance(Error.class, error);
        }

        private Error() {
        }

        private void clearCode() {
            this.code_ = 0;
        }

        private void clearReason() {
            this.bitField0_ &= -2;
            this.reason_ = getDefaultInstance().getReason();
        }

        private void clearRequestID() {
            this.requestID_ = 0;
        }

        public static Error getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Error parseDelimitedFrom(InputStream inputStream) {
            return (Error) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Error parseFrom(ByteBuffer byteBuffer) {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCode(b bVar) {
            this.code_ = bVar.getNumber();
        }

        private void setCodeValue(int i8) {
            this.code_ = i8;
        }

        private void setReason(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.reason_ = str;
        }

        private void setReasonBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.reason_ = abstractC2097h.T();
            this.bitField0_ |= 1;
        }

        private void setRequestID(int i8) {
            this.requestID_ = i8;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new Error();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\f\u0003ለ\u0000", new Object[]{"bitField0_", "requestID_", "code_", "reason_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (Error.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public b getCode() {
            b bVarB = b.b(this.code_);
            return bVarB == null ? b.UNRECOGNIZED : bVarB;
        }

        public int getCodeValue() {
            return this.code_;
        }

        public String getReason() {
            return this.reason_;
        }

        public AbstractC2097h getReasonBytes() {
            return AbstractC2097h.E(this.reason_);
        }

        public int getRequestID() {
            return this.requestID_;
        }

        public boolean hasReason() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(Error error) {
            return (a) DEFAULT_INSTANCE.createBuilder(error);
        }

        public static Error parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (Error) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static Error parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static Error parseFrom(AbstractC2097h abstractC2097h) {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static Error parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static Error parseFrom(byte[] bArr) {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Error parseFrom(byte[] bArr, C2106q c2106q) {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static Error parseFrom(InputStream inputStream) {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Error parseFrom(InputStream inputStream, C2106q c2106q) {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static Error parseFrom(AbstractC2098i abstractC2098i) {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static Error parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class HelloFromClient extends GeneratedMessageLite implements U {
        public static final int CLIENTINFORMATION_FIELD_NUMBER = 2;
        private static final HelloFromClient DEFAULT_INSTANCE;
        private static volatile g0 PARSER = null;
        public static final int PUBLICKEY_FIELD_NUMBER = 1;
        private int bitField0_;
        private ClientInformation clientInformation_;
        private AbstractC2097h publicKey_ = AbstractC2097h.f19285b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a f(ClientInformation.a aVar) {
                copyOnWrite();
                ((HelloFromClient) this.instance).setClientInformation((ClientInformation) aVar.build());
                return this;
            }

            public a g(AbstractC2097h abstractC2097h) {
                copyOnWrite();
                ((HelloFromClient) this.instance).setPublicKey(abstractC2097h);
                return this;
            }

            public a() {
                super(HelloFromClient.DEFAULT_INSTANCE);
            }
        }

        static {
            HelloFromClient helloFromClient = new HelloFromClient();
            DEFAULT_INSTANCE = helloFromClient;
            GeneratedMessageLite.registerDefaultInstance(HelloFromClient.class, helloFromClient);
        }

        private HelloFromClient() {
        }

        private void clearClientInformation() {
            this.clientInformation_ = null;
            this.bitField0_ &= -2;
        }

        private void clearPublicKey() {
            this.publicKey_ = getDefaultInstance().getPublicKey();
        }

        public static HelloFromClient getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeClientInformation(ClientInformation clientInformation) {
            clientInformation.getClass();
            ClientInformation clientInformation2 = this.clientInformation_;
            if (clientInformation2 == null || clientInformation2 == ClientInformation.getDefaultInstance()) {
                this.clientInformation_ = clientInformation;
            } else {
                this.clientInformation_ = (ClientInformation) ((ClientInformation.a) ClientInformation.newBuilder(this.clientInformation_).mergeFrom((GeneratedMessageLite) clientInformation)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static HelloFromClient parseDelimitedFrom(InputStream inputStream) {
            return (HelloFromClient) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HelloFromClient parseFrom(ByteBuffer byteBuffer) {
            return (HelloFromClient) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientInformation(ClientInformation clientInformation) {
            clientInformation.getClass();
            this.clientInformation_ = clientInformation;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPublicKey(AbstractC2097h abstractC2097h) {
            abstractC2097h.getClass();
            this.publicKey_ = abstractC2097h;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new HelloFromClient();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002ဉ\u0000", new Object[]{"bitField0_", "publicKey_", "clientInformation_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (HelloFromClient.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public ClientInformation getClientInformation() {
            ClientInformation clientInformation = this.clientInformation_;
            return clientInformation == null ? ClientInformation.getDefaultInstance() : clientInformation;
        }

        public AbstractC2097h getPublicKey() {
            return this.publicKey_;
        }

        public boolean hasClientInformation() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(HelloFromClient helloFromClient) {
            return (a) DEFAULT_INSTANCE.createBuilder(helloFromClient);
        }

        public static HelloFromClient parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (HelloFromClient) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static HelloFromClient parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (HelloFromClient) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static HelloFromClient parseFrom(AbstractC2097h abstractC2097h) {
            return (HelloFromClient) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static HelloFromClient parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (HelloFromClient) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static HelloFromClient parseFrom(byte[] bArr) {
            return (HelloFromClient) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HelloFromClient parseFrom(byte[] bArr, C2106q c2106q) {
            return (HelloFromClient) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static HelloFromClient parseFrom(InputStream inputStream) {
            return (HelloFromClient) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HelloFromClient parseFrom(InputStream inputStream, C2106q c2106q) {
            return (HelloFromClient) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static HelloFromClient parseFrom(AbstractC2098i abstractC2098i) {
            return (HelloFromClient) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static HelloFromClient parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (HelloFromClient) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class HelloFromServer extends GeneratedMessageLite implements U {
        public static final int CLIENTNEEDSAUTHENTICATION_FIELD_NUMBER = 6;
        private static final HelloFromServer DEFAULT_INSTANCE;
        public static final int ENDPOINTS_FIELD_NUMBER = 9;
        public static final int HOSTNAME_FIELD_NUMBER = 2;
        public static final int OSNAME_FIELD_NUMBER = 7;
        public static final int OSVERSION_FIELD_NUMBER = 8;
        private static volatile g0 PARSER = null;
        public static final int PROTOCOLVERSION_FIELD_NUMBER = 4;
        public static final int PUBLICKEY_FIELD_NUMBER = 5;
        public static final int VERSION_FIELD_NUMBER = 3;
        public static final int WORKSTATIONID_FIELD_NUMBER = 1;
        private int bitField0_;
        private boolean clientNeedsAuthentication_;
        private ServiceEndpoints endpoints_;
        private int protocolVersion_;
        private String workstationID_ = "";
        private String hostname_ = "";
        private String version_ = "";
        private AbstractC2097h publicKey_ = AbstractC2097h.f19285b;
        private String osName_ = "";
        private String osVersion_ = "";

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a() {
                super(HelloFromServer.DEFAULT_INSTANCE);
            }
        }

        static {
            HelloFromServer helloFromServer = new HelloFromServer();
            DEFAULT_INSTANCE = helloFromServer;
            GeneratedMessageLite.registerDefaultInstance(HelloFromServer.class, helloFromServer);
        }

        private HelloFromServer() {
        }

        private void clearClientNeedsAuthentication() {
            this.clientNeedsAuthentication_ = false;
        }

        private void clearEndpoints() {
            this.endpoints_ = null;
            this.bitField0_ &= -5;
        }

        private void clearHostname() {
            this.hostname_ = getDefaultInstance().getHostname();
        }

        private void clearOsName() {
            this.bitField0_ &= -2;
            this.osName_ = getDefaultInstance().getOsName();
        }

        private void clearOsVersion() {
            this.bitField0_ &= -3;
            this.osVersion_ = getDefaultInstance().getOsVersion();
        }

        private void clearProtocolVersion() {
            this.protocolVersion_ = 0;
        }

        private void clearPublicKey() {
            this.publicKey_ = getDefaultInstance().getPublicKey();
        }

        private void clearVersion() {
            this.version_ = getDefaultInstance().getVersion();
        }

        private void clearWorkstationID() {
            this.workstationID_ = getDefaultInstance().getWorkstationID();
        }

        public static HelloFromServer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeEndpoints(ServiceEndpoints serviceEndpoints) {
            serviceEndpoints.getClass();
            ServiceEndpoints serviceEndpoints2 = this.endpoints_;
            if (serviceEndpoints2 == null || serviceEndpoints2 == ServiceEndpoints.getDefaultInstance()) {
                this.endpoints_ = serviceEndpoints;
            } else {
                this.endpoints_ = (ServiceEndpoints) ((ServiceEndpoints.a) ServiceEndpoints.newBuilder(this.endpoints_).mergeFrom((GeneratedMessageLite) serviceEndpoints)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static HelloFromServer parseDelimitedFrom(InputStream inputStream) {
            return (HelloFromServer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HelloFromServer parseFrom(ByteBuffer byteBuffer) {
            return (HelloFromServer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setClientNeedsAuthentication(boolean z8) {
            this.clientNeedsAuthentication_ = z8;
        }

        private void setEndpoints(ServiceEndpoints serviceEndpoints) {
            serviceEndpoints.getClass();
            this.endpoints_ = serviceEndpoints;
            this.bitField0_ |= 4;
        }

        private void setHostname(String str) {
            str.getClass();
            this.hostname_ = str;
        }

        private void setHostnameBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.hostname_ = abstractC2097h.T();
        }

        private void setOsName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.osName_ = str;
        }

        private void setOsNameBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.osName_ = abstractC2097h.T();
            this.bitField0_ |= 1;
        }

        private void setOsVersion(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.osVersion_ = str;
        }

        private void setOsVersionBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.osVersion_ = abstractC2097h.T();
            this.bitField0_ |= 2;
        }

        private void setProtocolVersion(int i8) {
            this.protocolVersion_ = i8;
        }

        private void setPublicKey(AbstractC2097h abstractC2097h) {
            abstractC2097h.getClass();
            this.publicKey_ = abstractC2097h;
        }

        private void setVersion(String str) {
            str.getClass();
            this.version_ = str;
        }

        private void setVersionBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.version_ = abstractC2097h.T();
        }

        private void setWorkstationID(String str) {
            str.getClass();
            this.workstationID_ = str;
        }

        private void setWorkstationIDBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.workstationID_ = abstractC2097h.T();
        }

        public boolean getClientNeedsAuthentication() {
            return this.clientNeedsAuthentication_;
        }

        public ServiceEndpoints getEndpoints() {
            ServiceEndpoints serviceEndpoints = this.endpoints_;
            return serviceEndpoints == null ? ServiceEndpoints.getDefaultInstance() : serviceEndpoints;
        }

        public String getHostname() {
            return this.hostname_;
        }

        public AbstractC2097h getHostnameBytes() {
            return AbstractC2097h.E(this.hostname_);
        }

        public String getOsName() {
            return this.osName_;
        }

        public AbstractC2097h getOsNameBytes() {
            return AbstractC2097h.E(this.osName_);
        }

        public String getOsVersion() {
            return this.osVersion_;
        }

        public AbstractC2097h getOsVersionBytes() {
            return AbstractC2097h.E(this.osVersion_);
        }

        public int getProtocolVersion() {
            return this.protocolVersion_;
        }

        public AbstractC2097h getPublicKey() {
            return this.publicKey_;
        }

        public String getVersion() {
            return this.version_;
        }

        public AbstractC2097h getVersionBytes() {
            return AbstractC2097h.E(this.version_);
        }

        public String getWorkstationID() {
            return this.workstationID_;
        }

        public AbstractC2097h getWorkstationIDBytes() {
            return AbstractC2097h.E(this.workstationID_);
        }

        public boolean hasEndpoints() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasOsName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasOsVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        public static a newBuilder(HelloFromServer helloFromServer) {
            return (a) DEFAULT_INSTANCE.createBuilder(helloFromServer);
        }

        public static HelloFromServer parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (HelloFromServer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static HelloFromServer parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (HelloFromServer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new HelloFromServer();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u000b\u0005\n\u0006\u0007\u0007ለ\u0000\bለ\u0001\tဉ\u0002", new Object[]{"bitField0_", "workstationID_", "hostname_", "version_", "protocolVersion_", "publicKey_", "clientNeedsAuthentication_", "osName_", HRHLwtyqJWz.znTGoJoY, "endpoints_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (HelloFromServer.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static HelloFromServer parseFrom(AbstractC2097h abstractC2097h) {
            return (HelloFromServer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static HelloFromServer parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (HelloFromServer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static HelloFromServer parseFrom(byte[] bArr) {
            return (HelloFromServer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HelloFromServer parseFrom(byte[] bArr, C2106q c2106q) {
            return (HelloFromServer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static HelloFromServer parseFrom(InputStream inputStream) {
            return (HelloFromServer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HelloFromServer parseFrom(InputStream inputStream, C2106q c2106q) {
            return (HelloFromServer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static HelloFromServer parseFrom(AbstractC2098i abstractC2098i) {
            return (HelloFromServer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static HelloFromServer parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (HelloFromServer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Icon extends GeneratedMessageLite implements U {
        private static final Icon DEFAULT_INSTANCE;
        public static final int IMAGE_FIELD_NUMBER = 2;
        public static final int INDEX_FIELD_NUMBER = 1;
        private static volatile g0 PARSER;
        private int bitField0_;
        private Image image_;
        private int index_;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a() {
                super(Icon.DEFAULT_INSTANCE);
            }
        }

        static {
            Icon icon = new Icon();
            DEFAULT_INSTANCE = icon;
            GeneratedMessageLite.registerDefaultInstance(Icon.class, icon);
        }

        private Icon() {
        }

        private void clearImage() {
            this.image_ = null;
            this.bitField0_ &= -2;
        }

        private void clearIndex() {
            this.index_ = 0;
        }

        public static Icon getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeImage(Image image) {
            image.getClass();
            Image image2 = this.image_;
            if (image2 == null || image2 == Image.getDefaultInstance()) {
                this.image_ = image;
            } else {
                this.image_ = (Image) ((Image.a) Image.newBuilder(this.image_).mergeFrom((GeneratedMessageLite) image)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Icon parseDelimitedFrom(InputStream inputStream) {
            return (Icon) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Icon parseFrom(ByteBuffer byteBuffer) {
            return (Icon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setImage(Image image) {
            image.getClass();
            this.image_ = image;
            this.bitField0_ |= 1;
        }

        private void setIndex(int i8) {
            this.index_ = i8;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new Icon();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "index_", "image_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (Icon.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public Image getImage() {
            Image image = this.image_;
            return image == null ? Image.getDefaultInstance() : image;
        }

        public int getIndex() {
            return this.index_;
        }

        public boolean hasImage() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(Icon icon) {
            return (a) DEFAULT_INSTANCE.createBuilder(icon);
        }

        public static Icon parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (Icon) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static Icon parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (Icon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static Icon parseFrom(AbstractC2097h abstractC2097h) {
            return (Icon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static Icon parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (Icon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static Icon parseFrom(byte[] bArr) {
            return (Icon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Icon parseFrom(byte[] bArr, C2106q c2106q) {
            return (Icon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static Icon parseFrom(InputStream inputStream) {
            return (Icon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Icon parseFrom(InputStream inputStream, C2106q c2106q) {
            return (Icon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static Icon parseFrom(AbstractC2098i abstractC2098i) {
            return (Icon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static Icon parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (Icon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Image extends GeneratedMessageLite implements U {
        private static final Image DEFAULT_INSTANCE;
        public static final int FORMAT_FIELD_NUMBER = 1;
        public static final int IMAGE_FIELD_NUMBER = 5;
        private static volatile g0 PARSER = null;
        public static final int ROWBYTES_FIELD_NUMBER = 4;
        public static final int SIZE_FIELD_NUMBER = 3;
        public static final int TYPE_FIELD_NUMBER = 2;
        private int bitField0_;
        private int format_;
        private AbstractC2097h image_ = AbstractC2097h.f19285b;
        private int rowBytes_;
        private Size size_;
        private int type_;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a() {
                super(Image.DEFAULT_INSTANCE);
            }
        }

        static {
            Image image = new Image();
            DEFAULT_INSTANCE = image;
            GeneratedMessageLite.registerDefaultInstance(Image.class, image);
        }

        private Image() {
        }

        private void clearFormat() {
            this.format_ = 0;
        }

        private void clearImage() {
            this.image_ = getDefaultInstance().getImage();
        }

        private void clearRowBytes() {
            this.rowBytes_ = 0;
        }

        private void clearSize() {
            this.size_ = null;
            this.bitField0_ &= -2;
        }

        private void clearType() {
            this.type_ = 0;
        }

        public static Image getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeSize(Size size) {
            size.getClass();
            Size size2 = this.size_;
            if (size2 == null || size2 == Size.getDefaultInstance()) {
                this.size_ = size;
            } else {
                this.size_ = (Size) ((Size.a) Size.newBuilder(this.size_).mergeFrom((GeneratedMessageLite) size)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Image parseDelimitedFrom(InputStream inputStream) {
            return (Image) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Image parseFrom(ByteBuffer byteBuffer) {
            return (Image) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setFormat(c cVar) {
            this.format_ = cVar.getNumber();
        }

        private void setFormatValue(int i8) {
            this.format_ = i8;
        }

        private void setImage(AbstractC2097h abstractC2097h) {
            abstractC2097h.getClass();
            this.image_ = abstractC2097h;
        }

        private void setRowBytes(int i8) {
            this.rowBytes_ = i8;
        }

        private void setSize(Size size) {
            size.getClass();
            this.size_ = size;
            this.bitField0_ |= 1;
        }

        private void setType(d dVar) {
            this.type_ = dVar.getNumber();
        }

        private void setTypeValue(int i8) {
            this.type_ = i8;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new Image();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\f\u0003ဉ\u0000\u0004\u000b\u0005\n", new Object[]{"bitField0_", "format_", "type_", "size_", "rowBytes_", "image_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (Image.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public c getFormat() {
            c cVarB = c.b(this.format_);
            return cVarB == null ? c.f17775i : cVarB;
        }

        public int getFormatValue() {
            return this.format_;
        }

        public AbstractC2097h getImage() {
            return this.image_;
        }

        public int getRowBytes() {
            return this.rowBytes_;
        }

        public Size getSize() {
            Size size = this.size_;
            return size == null ? Size.getDefaultInstance() : size;
        }

        public d getType() {
            d dVarB = d.b(this.type_);
            return dVarB == null ? d.UNRECOGNIZED : dVarB;
        }

        public int getTypeValue() {
            return this.type_;
        }

        public boolean hasSize() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(Image image) {
            return (a) DEFAULT_INSTANCE.createBuilder(image);
        }

        public static Image parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (Image) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static Image parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (Image) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static Image parseFrom(AbstractC2097h abstractC2097h) {
            return (Image) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static Image parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (Image) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static Image parseFrom(byte[] bArr) {
            return (Image) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Image parseFrom(byte[] bArr, C2106q c2106q) {
            return (Image) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static Image parseFrom(InputStream inputStream) {
            return (Image) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Image parseFrom(InputStream inputStream, C2106q c2106q) {
            return (Image) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static Image parseFrom(AbstractC2098i abstractC2098i) {
            return (Image) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static Image parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (Image) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class KeyPress extends GeneratedMessageLite implements U {
        private static final KeyPress DEFAULT_INSTANCE;
        public static final int INDEX_FIELD_NUMBER = 1;
        private static volatile g0 PARSER = null;
        public static final int PRESSED_FIELD_NUMBER = 2;
        private int index_;
        private boolean pressed_;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a f(int i8) {
                copyOnWrite();
                ((KeyPress) this.instance).setIndex(i8);
                return this;
            }

            public a g(boolean z8) {
                copyOnWrite();
                ((KeyPress) this.instance).setPressed(z8);
                return this;
            }

            public a() {
                super(KeyPress.DEFAULT_INSTANCE);
            }
        }

        static {
            KeyPress keyPress = new KeyPress();
            DEFAULT_INSTANCE = keyPress;
            GeneratedMessageLite.registerDefaultInstance(KeyPress.class, keyPress);
        }

        private KeyPress() {
        }

        private void clearIndex() {
            this.index_ = 0;
        }

        private void clearPressed() {
            this.pressed_ = false;
        }

        public static KeyPress getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static KeyPress parseDelimitedFrom(InputStream inputStream) {
            return (KeyPress) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static KeyPress parseFrom(ByteBuffer byteBuffer) {
            return (KeyPress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIndex(int i8) {
            this.index_ = i8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPressed(boolean z8) {
            this.pressed_ = z8;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new KeyPress();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u0007", new Object[]{"index_", "pressed_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (KeyPress.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getIndex() {
            return this.index_;
        }

        public boolean getPressed() {
            return this.pressed_;
        }

        public static a newBuilder(KeyPress keyPress) {
            return (a) DEFAULT_INSTANCE.createBuilder(keyPress);
        }

        public static KeyPress parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (KeyPress) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static KeyPress parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (KeyPress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static KeyPress parseFrom(AbstractC2097h abstractC2097h) {
            return (KeyPress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static KeyPress parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (KeyPress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static KeyPress parseFrom(byte[] bArr) {
            return (KeyPress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static KeyPress parseFrom(byte[] bArr, C2106q c2106q) {
            return (KeyPress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static KeyPress parseFrom(InputStream inputStream) {
            return (KeyPress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static KeyPress parseFrom(InputStream inputStream, C2106q c2106q) {
            return (KeyPress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static KeyPress parseFrom(AbstractC2098i abstractC2098i) {
            return (KeyPress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static KeyPress parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (KeyPress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class KeypadConfig extends GeneratedMessageLite implements U {
        private static final KeypadConfig DEFAULT_INSTANCE;
        public static final int ENABLECONTEXTAPI_FIELD_NUMBER = 7;
        public static final int HIGHDPI_FIELD_NUMBER = 4;
        public static final int ICONSIZE_FIELD_NUMBER = 2;
        public static final int LAYOUTCROP_FIELD_NUMBER = 6;
        public static final int OVERSCALE_FIELD_NUMBER = 5;
        private static volatile g0 PARSER = null;
        public static final int PRESSEDICONSIZE_FIELD_NUMBER = 3;
        public static final int SUPPORTEDICONIMAGEFORMATS_FIELD_NUMBER = 1;
        private static final A.h.a supportedIconImageFormats_converter_ = new a();
        private int bitField0_;
        private boolean enableContextAPI_;
        private boolean highDPI_;
        private Size iconSize_;
        private Size layoutCrop_;
        private boolean overscale_;
        private Size pressedIconSize_;
        private int supportedIconImageFormatsMemoizedSerializedSize;
        private A.g supportedIconImageFormats_ = GeneratedMessageLite.emptyIntList();

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class a implements A.h.a {
            @Override // com.google.protobuf.A.h.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c a(Integer num) {
                c cVarB = c.b(num.intValue());
                return cVarB == null ? c.f17775i : cVarB;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends GeneratedMessageLite.b implements U {
            public b f(c cVar) {
                copyOnWrite();
                ((KeypadConfig) this.instance).addSupportedIconImageFormats(cVar);
                return this;
            }

            public b g(boolean z8) {
                copyOnWrite();
                ((KeypadConfig) this.instance).setEnableContextAPI(z8);
                return this;
            }

            public b h(boolean z8) {
                copyOnWrite();
                ((KeypadConfig) this.instance).setHighDPI(z8);
                return this;
            }

            public b i(Size size) {
                copyOnWrite();
                ((KeypadConfig) this.instance).setIconSize(size);
                return this;
            }

            public b k(Size size) {
                copyOnWrite();
                ((KeypadConfig) this.instance).setLayoutCrop(size);
                return this;
            }

            public b l(boolean z8) {
                copyOnWrite();
                ((KeypadConfig) this.instance).setOverscale(z8);
                return this;
            }

            public b() {
                super(KeypadConfig.DEFAULT_INSTANCE);
            }
        }

        static {
            KeypadConfig keypadConfig = new KeypadConfig();
            DEFAULT_INSTANCE = keypadConfig;
            GeneratedMessageLite.registerDefaultInstance(KeypadConfig.class, keypadConfig);
        }

        private KeypadConfig() {
        }

        private void addAllSupportedIconImageFormats(Iterable<? extends c> iterable) {
            ensureSupportedIconImageFormatsIsMutable();
            Iterator<? extends c> it = iterable.iterator();
            while (it.hasNext()) {
                this.supportedIconImageFormats_.l(it.next().getNumber());
            }
        }

        private void addAllSupportedIconImageFormatsValue(Iterable<Integer> iterable) {
            ensureSupportedIconImageFormatsIsMutable();
            Iterator<Integer> it = iterable.iterator();
            while (it.hasNext()) {
                this.supportedIconImageFormats_.l(it.next().intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSupportedIconImageFormats(c cVar) {
            cVar.getClass();
            ensureSupportedIconImageFormatsIsMutable();
            this.supportedIconImageFormats_.l(cVar.getNumber());
        }

        private void addSupportedIconImageFormatsValue(int i8) {
            ensureSupportedIconImageFormatsIsMutable();
            this.supportedIconImageFormats_.l(i8);
        }

        private void clearEnableContextAPI() {
            this.enableContextAPI_ = false;
        }

        private void clearHighDPI() {
            this.highDPI_ = false;
        }

        private void clearIconSize() {
            this.iconSize_ = null;
            this.bitField0_ &= -2;
        }

        private void clearLayoutCrop() {
            this.layoutCrop_ = null;
            this.bitField0_ &= -5;
        }

        private void clearOverscale() {
            this.overscale_ = false;
        }

        private void clearPressedIconSize() {
            this.pressedIconSize_ = null;
            this.bitField0_ &= -3;
        }

        private void clearSupportedIconImageFormats() {
            this.supportedIconImageFormats_ = GeneratedMessageLite.emptyIntList();
        }

        private void ensureSupportedIconImageFormatsIsMutable() {
            A.g gVar = this.supportedIconImageFormats_;
            if (gVar.C()) {
                return;
            }
            this.supportedIconImageFormats_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        public static KeypadConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeIconSize(Size size) {
            size.getClass();
            Size size2 = this.iconSize_;
            if (size2 == null || size2 == Size.getDefaultInstance()) {
                this.iconSize_ = size;
            } else {
                this.iconSize_ = (Size) ((Size.a) Size.newBuilder(this.iconSize_).mergeFrom((GeneratedMessageLite) size)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeLayoutCrop(Size size) {
            size.getClass();
            Size size2 = this.layoutCrop_;
            if (size2 == null || size2 == Size.getDefaultInstance()) {
                this.layoutCrop_ = size;
            } else {
                this.layoutCrop_ = (Size) ((Size.a) Size.newBuilder(this.layoutCrop_).mergeFrom((GeneratedMessageLite) size)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        private void mergePressedIconSize(Size size) {
            size.getClass();
            Size size2 = this.pressedIconSize_;
            if (size2 == null || size2 == Size.getDefaultInstance()) {
                this.pressedIconSize_ = size;
            } else {
                this.pressedIconSize_ = (Size) ((Size.a) Size.newBuilder(this.pressedIconSize_).mergeFrom((GeneratedMessageLite) size)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static b newBuilder() {
            return (b) DEFAULT_INSTANCE.createBuilder();
        }

        public static KeypadConfig parseDelimitedFrom(InputStream inputStream) {
            return (KeypadConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static KeypadConfig parseFrom(ByteBuffer byteBuffer) {
            return (KeypadConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnableContextAPI(boolean z8) {
            this.enableContextAPI_ = z8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHighDPI(boolean z8) {
            this.highDPI_ = z8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconSize(Size size) {
            size.getClass();
            this.iconSize_ = size;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLayoutCrop(Size size) {
            size.getClass();
            this.layoutCrop_ = size;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOverscale(boolean z8) {
            this.overscale_ = z8;
        }

        private void setPressedIconSize(Size size) {
            size.getClass();
            this.pressedIconSize_ = size;
            this.bitField0_ |= 2;
        }

        private void setSupportedIconImageFormats(int i8, c cVar) {
            cVar.getClass();
            ensureSupportedIconImageFormatsIsMutable();
            this.supportedIconImageFormats_.h(i8, cVar.getNumber());
        }

        private void setSupportedIconImageFormatsValue(int i8, int i9) {
            ensureSupportedIconImageFormatsIsMutable();
            this.supportedIconImageFormats_.h(i8, i9);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new KeypadConfig();
                case 2:
                    return new b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001,\u0002ဉ\u0000\u0003ဉ\u0001\u0004\u0007\u0005\u0007\u0006ဉ\u0002\u0007\u0007", new Object[]{"bitField0_", "supportedIconImageFormats_", "iconSize_", "pressedIconSize_", "highDPI_", "overscale_", "layoutCrop_", "enableContextAPI_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (KeypadConfig.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public boolean getEnableContextAPI() {
            return this.enableContextAPI_;
        }

        public boolean getHighDPI() {
            return this.highDPI_;
        }

        public Size getIconSize() {
            Size size = this.iconSize_;
            return size == null ? Size.getDefaultInstance() : size;
        }

        public Size getLayoutCrop() {
            Size size = this.layoutCrop_;
            return size == null ? Size.getDefaultInstance() : size;
        }

        public boolean getOverscale() {
            return this.overscale_;
        }

        public Size getPressedIconSize() {
            Size size = this.pressedIconSize_;
            return size == null ? Size.getDefaultInstance() : size;
        }

        public c getSupportedIconImageFormats(int i8) {
            c cVarB = c.b(this.supportedIconImageFormats_.getInt(i8));
            return cVarB == null ? c.f17775i : cVarB;
        }

        public int getSupportedIconImageFormatsCount() {
            return this.supportedIconImageFormats_.size();
        }

        public List<c> getSupportedIconImageFormatsList() {
            return new A.h(this.supportedIconImageFormats_, supportedIconImageFormats_converter_);
        }

        public int getSupportedIconImageFormatsValue(int i8) {
            return this.supportedIconImageFormats_.getInt(i8);
        }

        public List<Integer> getSupportedIconImageFormatsValueList() {
            return this.supportedIconImageFormats_;
        }

        public boolean hasIconSize() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasLayoutCrop() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasPressedIconSize() {
            return (this.bitField0_ & 2) != 0;
        }

        public static b newBuilder(KeypadConfig keypadConfig) {
            return (b) DEFAULT_INSTANCE.createBuilder(keypadConfig);
        }

        public static KeypadConfig parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (KeypadConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static KeypadConfig parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (KeypadConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static KeypadConfig parseFrom(AbstractC2097h abstractC2097h) {
            return (KeypadConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static KeypadConfig parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (KeypadConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static KeypadConfig parseFrom(byte[] bArr) {
            return (KeypadConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static KeypadConfig parseFrom(byte[] bArr, C2106q c2106q) {
            return (KeypadConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static KeypadConfig parseFrom(InputStream inputStream) {
            return (KeypadConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static KeypadConfig parseFrom(InputStream inputStream, C2106q c2106q) {
            return (KeypadConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static KeypadConfig parseFrom(AbstractC2098i abstractC2098i) {
            return (KeypadConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static KeypadConfig parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (KeypadConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class NextPage extends GeneratedMessageLite implements U {
        private static final NextPage DEFAULT_INSTANCE;
        private static volatile g0 PARSER;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a() {
                super(NextPage.DEFAULT_INSTANCE);
            }
        }

        static {
            NextPage nextPage = new NextPage();
            DEFAULT_INSTANCE = nextPage;
            GeneratedMessageLite.registerDefaultInstance(NextPage.class, nextPage);
        }

        private NextPage() {
        }

        public static NextPage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static NextPage parseDelimitedFrom(InputStream inputStream) {
            return (NextPage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NextPage parseFrom(ByteBuffer byteBuffer) {
            return (NextPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new NextPage();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (NextPage.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static a newBuilder(NextPage nextPage) {
            return (a) DEFAULT_INSTANCE.createBuilder(nextPage);
        }

        public static NextPage parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (NextPage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static NextPage parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (NextPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static NextPage parseFrom(AbstractC2097h abstractC2097h) {
            return (NextPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static NextPage parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (NextPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static NextPage parseFrom(byte[] bArr) {
            return (NextPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NextPage parseFrom(byte[] bArr, C2106q c2106q) {
            return (NextPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static NextPage parseFrom(InputStream inputStream) {
            return (NextPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NextPage parseFrom(InputStream inputStream, C2106q c2106q) {
            return (NextPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static NextPage parseFrom(AbstractC2098i abstractC2098i) {
            return (NextPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static NextPage parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (NextPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Ok extends GeneratedMessageLite implements U {
        private static final Ok DEFAULT_INSTANCE;
        private static volatile g0 PARSER = null;
        public static final int REQUESTID_FIELD_NUMBER = 1;
        private int requestID_;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a() {
                super(Ok.DEFAULT_INSTANCE);
            }
        }

        static {
            Ok ok = new Ok();
            DEFAULT_INSTANCE = ok;
            GeneratedMessageLite.registerDefaultInstance(Ok.class, ok);
        }

        private Ok() {
        }

        private void clearRequestID() {
            this.requestID_ = 0;
        }

        public static Ok getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Ok parseDelimitedFrom(InputStream inputStream) {
            return (Ok) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Ok parseFrom(ByteBuffer byteBuffer) {
            return (Ok) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setRequestID(int i8) {
            this.requestID_ = i8;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new Ok();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"requestID_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (Ok.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getRequestID() {
            return this.requestID_;
        }

        public static a newBuilder(Ok ok) {
            return (a) DEFAULT_INSTANCE.createBuilder(ok);
        }

        public static Ok parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (Ok) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static Ok parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (Ok) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static Ok parseFrom(AbstractC2097h abstractC2097h) {
            return (Ok) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static Ok parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (Ok) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static Ok parseFrom(byte[] bArr) {
            return (Ok) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Ok parseFrom(byte[] bArr, C2106q c2106q) {
            return (Ok) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static Ok parseFrom(InputStream inputStream) {
            return (Ok) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Ok parseFrom(InputStream inputStream, C2106q c2106q) {
            return (Ok) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static Ok parseFrom(AbstractC2098i abstractC2098i) {
            return (Ok) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static Ok parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (Ok) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class OpenVirtualDevice extends GeneratedMessageLite implements U {
        private static final OpenVirtualDevice DEFAULT_INSTANCE;
        public static final int DEVICEID_FIELD_NUMBER = 2;
        public static final int KEYPADCONFIG_FIELD_NUMBER = 3;
        private static volatile g0 PARSER = null;
        public static final int REQUESTID_FIELD_NUMBER = 1;
        private int bitField0_;
        private String deviceID_ = "";
        private KeypadConfig keypadConfig_;
        private int requestID_;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a f(String str) {
                copyOnWrite();
                ((OpenVirtualDevice) this.instance).setDeviceID(str);
                return this;
            }

            public a g(KeypadConfig keypadConfig) {
                copyOnWrite();
                ((OpenVirtualDevice) this.instance).setKeypadConfig(keypadConfig);
                return this;
            }

            public a h(int i8) {
                copyOnWrite();
                ((OpenVirtualDevice) this.instance).setRequestID(i8);
                return this;
            }

            public a() {
                super(OpenVirtualDevice.DEFAULT_INSTANCE);
            }
        }

        static {
            OpenVirtualDevice openVirtualDevice = new OpenVirtualDevice();
            DEFAULT_INSTANCE = openVirtualDevice;
            GeneratedMessageLite.registerDefaultInstance(OpenVirtualDevice.class, openVirtualDevice);
        }

        private OpenVirtualDevice() {
        }

        private void clearDeviceID() {
            this.deviceID_ = getDefaultInstance().getDeviceID();
        }

        private void clearKeypadConfig() {
            this.keypadConfig_ = null;
            this.bitField0_ &= -2;
        }

        private void clearRequestID() {
            this.requestID_ = 0;
        }

        public static OpenVirtualDevice getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeKeypadConfig(KeypadConfig keypadConfig) {
            keypadConfig.getClass();
            KeypadConfig keypadConfig2 = this.keypadConfig_;
            if (keypadConfig2 == null || keypadConfig2 == KeypadConfig.getDefaultInstance()) {
                this.keypadConfig_ = keypadConfig;
            } else {
                this.keypadConfig_ = (KeypadConfig) ((KeypadConfig.b) KeypadConfig.newBuilder(this.keypadConfig_).mergeFrom((GeneratedMessageLite) keypadConfig)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static OpenVirtualDevice parseDelimitedFrom(InputStream inputStream) {
            return (OpenVirtualDevice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OpenVirtualDevice parseFrom(ByteBuffer byteBuffer) {
            return (OpenVirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceID(String str) {
            str.getClass();
            this.deviceID_ = str;
        }

        private void setDeviceIDBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.deviceID_ = abstractC2097h.T();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeypadConfig(KeypadConfig keypadConfig) {
            keypadConfig.getClass();
            this.keypadConfig_ = keypadConfig;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequestID(int i8) {
            this.requestID_ = i8;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new OpenVirtualDevice();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "requestID_", "deviceID_", "keypadConfig_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (OpenVirtualDevice.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getDeviceID() {
            return this.deviceID_;
        }

        public AbstractC2097h getDeviceIDBytes() {
            return AbstractC2097h.E(this.deviceID_);
        }

        public KeypadConfig getKeypadConfig() {
            KeypadConfig keypadConfig = this.keypadConfig_;
            return keypadConfig == null ? KeypadConfig.getDefaultInstance() : keypadConfig;
        }

        public int getRequestID() {
            return this.requestID_;
        }

        public boolean hasKeypadConfig() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(OpenVirtualDevice openVirtualDevice) {
            return (a) DEFAULT_INSTANCE.createBuilder(openVirtualDevice);
        }

        public static OpenVirtualDevice parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (OpenVirtualDevice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static OpenVirtualDevice parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (OpenVirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static OpenVirtualDevice parseFrom(AbstractC2097h abstractC2097h) {
            return (OpenVirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static OpenVirtualDevice parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (OpenVirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static OpenVirtualDevice parseFrom(byte[] bArr) {
            return (OpenVirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OpenVirtualDevice parseFrom(byte[] bArr, C2106q c2106q) {
            return (OpenVirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static OpenVirtualDevice parseFrom(InputStream inputStream) {
            return (OpenVirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OpenVirtualDevice parseFrom(InputStream inputStream, C2106q c2106q) {
            return (OpenVirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static OpenVirtualDevice parseFrom(AbstractC2098i abstractC2098i) {
            return (OpenVirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static OpenVirtualDevice parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (OpenVirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class PageByIndex extends GeneratedMessageLite implements U {
        private static final PageByIndex DEFAULT_INSTANCE;
        public static final int INDEX_FIELD_NUMBER = 1;
        private static volatile g0 PARSER;
        private int index_;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a() {
                super(PageByIndex.DEFAULT_INSTANCE);
            }
        }

        static {
            PageByIndex pageByIndex = new PageByIndex();
            DEFAULT_INSTANCE = pageByIndex;
            GeneratedMessageLite.registerDefaultInstance(PageByIndex.class, pageByIndex);
        }

        private PageByIndex() {
        }

        private void clearIndex() {
            this.index_ = 0;
        }

        public static PageByIndex getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static PageByIndex parseDelimitedFrom(InputStream inputStream) {
            return (PageByIndex) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PageByIndex parseFrom(ByteBuffer byteBuffer) {
            return (PageByIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setIndex(int i8) {
            this.index_ = i8;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new PageByIndex();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"index_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (PageByIndex.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getIndex() {
            return this.index_;
        }

        public static a newBuilder(PageByIndex pageByIndex) {
            return (a) DEFAULT_INSTANCE.createBuilder(pageByIndex);
        }

        public static PageByIndex parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (PageByIndex) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static PageByIndex parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (PageByIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static PageByIndex parseFrom(AbstractC2097h abstractC2097h) {
            return (PageByIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static PageByIndex parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (PageByIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static PageByIndex parseFrom(byte[] bArr) {
            return (PageByIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PageByIndex parseFrom(byte[] bArr, C2106q c2106q) {
            return (PageByIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static PageByIndex parseFrom(InputStream inputStream) {
            return (PageByIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PageByIndex parseFrom(InputStream inputStream, C2106q c2106q) {
            return (PageByIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static PageByIndex parseFrom(AbstractC2098i abstractC2098i) {
            return (PageByIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static PageByIndex parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (PageByIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class PreviousPage extends GeneratedMessageLite implements U {
        private static final PreviousPage DEFAULT_INSTANCE;
        private static volatile g0 PARSER;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a() {
                super(PreviousPage.DEFAULT_INSTANCE);
            }
        }

        static {
            PreviousPage previousPage = new PreviousPage();
            DEFAULT_INSTANCE = previousPage;
            GeneratedMessageLite.registerDefaultInstance(PreviousPage.class, previousPage);
        }

        private PreviousPage() {
        }

        public static PreviousPage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static PreviousPage parseDelimitedFrom(InputStream inputStream) {
            return (PreviousPage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PreviousPage parseFrom(ByteBuffer byteBuffer) {
            return (PreviousPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new PreviousPage();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (PreviousPage.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static a newBuilder(PreviousPage previousPage) {
            return (a) DEFAULT_INSTANCE.createBuilder(previousPage);
        }

        public static PreviousPage parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (PreviousPage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static PreviousPage parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (PreviousPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static PreviousPage parseFrom(AbstractC2097h abstractC2097h) {
            return (PreviousPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static PreviousPage parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (PreviousPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static PreviousPage parseFrom(byte[] bArr) {
            return (PreviousPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PreviousPage parseFrom(byte[] bArr, C2106q c2106q) {
            return (PreviousPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static PreviousPage parseFrom(InputStream inputStream) {
            return (PreviousPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PreviousPage parseFrom(InputStream inputStream, C2106q c2106q) {
            return (PreviousPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static PreviousPage parseFrom(AbstractC2098i abstractC2098i) {
            return (PreviousPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static PreviousPage parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (PreviousPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class RemoveShortcut extends GeneratedMessageLite implements U {
        private static final RemoveShortcut DEFAULT_INSTANCE;
        private static volatile g0 PARSER = null;
        public static final int REQUESTID_FIELD_NUMBER = 1;
        public static final int SHORTCUTID_FIELD_NUMBER = 2;
        private int requestID_;
        private String shortcutID_ = WqXA.ixHrYrLzgBU;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a() {
                super(RemoveShortcut.DEFAULT_INSTANCE);
            }
        }

        static {
            RemoveShortcut removeShortcut = new RemoveShortcut();
            DEFAULT_INSTANCE = removeShortcut;
            GeneratedMessageLite.registerDefaultInstance(RemoveShortcut.class, removeShortcut);
        }

        private void clearRequestID() {
            this.requestID_ = 0;
        }

        private void clearShortcutID() {
            this.shortcutID_ = getDefaultInstance().getShortcutID();
        }

        public static RemoveShortcut getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static RemoveShortcut parseDelimitedFrom(InputStream inputStream) {
            return (RemoveShortcut) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RemoveShortcut parseFrom(ByteBuffer byteBuffer) {
            return (RemoveShortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setRequestID(int i8) {
            this.requestID_ = i8;
        }

        private void setShortcutID(String str) {
            str.getClass();
            this.shortcutID_ = str;
        }

        private void setShortcutIDBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.shortcutID_ = abstractC2097h.T();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new RemoveShortcut();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002Ȉ", new Object[]{"requestID_", "shortcutID_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (RemoveShortcut.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getRequestID() {
            return this.requestID_;
        }

        public String getShortcutID() {
            return this.shortcutID_;
        }

        public AbstractC2097h getShortcutIDBytes() {
            return AbstractC2097h.E(this.shortcutID_);
        }

        public static a newBuilder(RemoveShortcut removeShortcut) {
            return (a) DEFAULT_INSTANCE.createBuilder(removeShortcut);
        }

        public static RemoveShortcut parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (RemoveShortcut) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static RemoveShortcut parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (RemoveShortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        private RemoveShortcut() {
        }

        public static RemoveShortcut parseFrom(AbstractC2097h abstractC2097h) {
            return (RemoveShortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static RemoveShortcut parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (RemoveShortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static RemoveShortcut parseFrom(byte[] bArr) {
            return (RemoveShortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RemoveShortcut parseFrom(byte[] bArr, C2106q c2106q) {
            return (RemoveShortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static RemoveShortcut parseFrom(InputStream inputStream) {
            return (RemoveShortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RemoveShortcut parseFrom(InputStream inputStream, C2106q c2106q) {
            return (RemoveShortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static RemoveShortcut parseFrom(AbstractC2098i abstractC2098i) {
            return (RemoveShortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static RemoveShortcut parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (RemoveShortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class ServerMessage extends GeneratedMessageLite implements U {
        public static final int CONTEXTUPDATE_FIELD_NUMBER = 31;
        public static final int CONTEXT_FIELD_NUMBER = 30;
        private static final ServerMessage DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 1;
        public static final int HELLO_FIELD_NUMBER = 10;
        public static final int ICON_FIELD_NUMBER = 40;
        public static final int OK_FIELD_NUMBER = 2;
        private static volatile g0 PARSER = null;
        public static final int SHORTCUTSUPDATE_FIELD_NUMBER = 33;
        public static final int SHORTCUTS_FIELD_NUMBER = 32;
        public static final int VIRTUALDEVICELIST_FIELD_NUMBER = 20;
        public static final int VIRTUALDEVICEOPENED_FIELD_NUMBER = 21;
        private int payloadCase_ = 0;
        private Object payload_;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a() {
                super(ServerMessage.DEFAULT_INSTANCE);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public enum b {
            ERROR(1),
            OK(2),
            HELLO(10),
            VIRTUALDEVICELIST(20),
            VIRTUALDEVICEOPENED(21),
            CONTEXT(30),
            CONTEXTUPDATE(31),
            SHORTCUTS(32),
            SHORTCUTSUPDATE(33),
            ICON(40),
            PAYLOAD_NOT_SET(0);


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f17766a;

            b(int i8) {
                this.f17766a = i8;
            }

            public static b b(int i8) {
                if (i8 == 0) {
                    return PAYLOAD_NOT_SET;
                }
                if (i8 == 1) {
                    return ERROR;
                }
                if (i8 == 2) {
                    return OK;
                }
                if (i8 == 10) {
                    return HELLO;
                }
                if (i8 == 40) {
                    return ICON;
                }
                if (i8 == 20) {
                    return VIRTUALDEVICELIST;
                }
                if (i8 == 21) {
                    return VIRTUALDEVICEOPENED;
                }
                switch (i8) {
                    case 30:
                        return CONTEXT;
                    case 31:
                        return CONTEXTUPDATE;
                    case 32:
                        return SHORTCUTS;
                    case 33:
                        return SHORTCUTSUPDATE;
                    default:
                        return null;
                }
            }
        }

        static {
            ServerMessage serverMessage = new ServerMessage();
            DEFAULT_INSTANCE = serverMessage;
            GeneratedMessageLite.registerDefaultInstance(ServerMessage.class, serverMessage);
        }

        private ServerMessage() {
        }

        private void clearContext() {
            if (this.payloadCase_ == 30) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        private void clearContextUpdate() {
            if (this.payloadCase_ == 31) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        private void clearError() {
            if (this.payloadCase_ == 1) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        private void clearHello() {
            if (this.payloadCase_ == 10) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        private void clearIcon() {
            if (this.payloadCase_ == 40) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        private void clearOk() {
            if (this.payloadCase_ == 2) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        private void clearPayload() {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }

        private void clearShortcuts() {
            if (this.payloadCase_ == 32) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        private void clearShortcutsUpdate() {
            if (this.payloadCase_ == 33) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        private void clearVirtualDeviceList() {
            if (this.payloadCase_ == 20) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        private void clearVirtualDeviceOpened() {
            if (this.payloadCase_ == 21) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        public static ServerMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeContext(Context context) {
            context.getClass();
            if (this.payloadCase_ != 30 || this.payload_ == Context.getDefaultInstance()) {
                this.payload_ = context;
            } else {
                this.payload_ = ((Context.a) Context.newBuilder((Context) this.payload_).mergeFrom((GeneratedMessageLite) context)).buildPartial();
            }
            this.payloadCase_ = 30;
        }

        private void mergeContextUpdate(ContextUpdate contextUpdate) {
            contextUpdate.getClass();
            if (this.payloadCase_ != 31 || this.payload_ == ContextUpdate.getDefaultInstance()) {
                this.payload_ = contextUpdate;
            } else {
                this.payload_ = ((ContextUpdate.a) ContextUpdate.newBuilder((ContextUpdate) this.payload_).mergeFrom((GeneratedMessageLite) contextUpdate)).buildPartial();
            }
            this.payloadCase_ = 31;
        }

        private void mergeError(Error error) {
            error.getClass();
            if (this.payloadCase_ != 1 || this.payload_ == Error.getDefaultInstance()) {
                this.payload_ = error;
            } else {
                this.payload_ = ((Error.a) Error.newBuilder((Error) this.payload_).mergeFrom((GeneratedMessageLite) error)).buildPartial();
            }
            this.payloadCase_ = 1;
        }

        private void mergeHello(HelloFromServer helloFromServer) {
            helloFromServer.getClass();
            if (this.payloadCase_ != 10 || this.payload_ == HelloFromServer.getDefaultInstance()) {
                this.payload_ = helloFromServer;
            } else {
                this.payload_ = ((HelloFromServer.a) HelloFromServer.newBuilder((HelloFromServer) this.payload_).mergeFrom((GeneratedMessageLite) helloFromServer)).buildPartial();
            }
            this.payloadCase_ = 10;
        }

        private void mergeIcon(Icon icon) {
            icon.getClass();
            if (this.payloadCase_ != 40 || this.payload_ == Icon.getDefaultInstance()) {
                this.payload_ = icon;
            } else {
                this.payload_ = ((Icon.a) Icon.newBuilder((Icon) this.payload_).mergeFrom((GeneratedMessageLite) icon)).buildPartial();
            }
            this.payloadCase_ = 40;
        }

        private void mergeOk(Ok ok) {
            ok.getClass();
            if (this.payloadCase_ != 2 || this.payload_ == Ok.getDefaultInstance()) {
                this.payload_ = ok;
            } else {
                this.payload_ = ((Ok.a) Ok.newBuilder((Ok) this.payload_).mergeFrom((GeneratedMessageLite) ok)).buildPartial();
            }
            this.payloadCase_ = 2;
        }

        private void mergeShortcuts(Shortcuts shortcuts) {
            shortcuts.getClass();
            if (this.payloadCase_ != 32 || this.payload_ == Shortcuts.getDefaultInstance()) {
                this.payload_ = shortcuts;
            } else {
                this.payload_ = ((Shortcuts.a) Shortcuts.newBuilder((Shortcuts) this.payload_).mergeFrom((GeneratedMessageLite) shortcuts)).buildPartial();
            }
            this.payloadCase_ = 32;
        }

        private void mergeShortcutsUpdate(ShortcutsUpdate shortcutsUpdate) {
            shortcutsUpdate.getClass();
            if (this.payloadCase_ != 33 || this.payload_ == ShortcutsUpdate.getDefaultInstance()) {
                this.payload_ = shortcutsUpdate;
            } else {
                this.payload_ = ((ShortcutsUpdate.a) ShortcutsUpdate.newBuilder((ShortcutsUpdate) this.payload_).mergeFrom((GeneratedMessageLite) shortcutsUpdate)).buildPartial();
            }
            this.payloadCase_ = 33;
        }

        private void mergeVirtualDeviceList(VirtualDeviceList virtualDeviceList) {
            virtualDeviceList.getClass();
            if (this.payloadCase_ != 20 || this.payload_ == VirtualDeviceList.getDefaultInstance()) {
                this.payload_ = virtualDeviceList;
            } else {
                this.payload_ = ((VirtualDeviceList.a) VirtualDeviceList.newBuilder((VirtualDeviceList) this.payload_).mergeFrom((GeneratedMessageLite) virtualDeviceList)).buildPartial();
            }
            this.payloadCase_ = 20;
        }

        private void mergeVirtualDeviceOpened(VirtualDeviceOpened virtualDeviceOpened) {
            virtualDeviceOpened.getClass();
            if (this.payloadCase_ != 21 || this.payload_ == VirtualDeviceOpened.getDefaultInstance()) {
                this.payload_ = virtualDeviceOpened;
            } else {
                this.payload_ = ((VirtualDeviceOpened.a) VirtualDeviceOpened.newBuilder((VirtualDeviceOpened) this.payload_).mergeFrom((GeneratedMessageLite) virtualDeviceOpened)).buildPartial();
            }
            this.payloadCase_ = 21;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static ServerMessage parseDelimitedFrom(InputStream inputStream) {
            return (ServerMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServerMessage parseFrom(ByteBuffer byteBuffer) {
            return (ServerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setContext(Context context) {
            context.getClass();
            this.payload_ = context;
            this.payloadCase_ = 30;
        }

        private void setContextUpdate(ContextUpdate contextUpdate) {
            contextUpdate.getClass();
            this.payload_ = contextUpdate;
            this.payloadCase_ = 31;
        }

        private void setError(Error error) {
            error.getClass();
            this.payload_ = error;
            this.payloadCase_ = 1;
        }

        private void setHello(HelloFromServer helloFromServer) {
            helloFromServer.getClass();
            this.payload_ = helloFromServer;
            this.payloadCase_ = 10;
        }

        private void setIcon(Icon icon) {
            icon.getClass();
            this.payload_ = icon;
            this.payloadCase_ = 40;
        }

        private void setOk(Ok ok) {
            ok.getClass();
            this.payload_ = ok;
            this.payloadCase_ = 2;
        }

        private void setShortcuts(Shortcuts shortcuts) {
            shortcuts.getClass();
            this.payload_ = shortcuts;
            this.payloadCase_ = 32;
        }

        private void setShortcutsUpdate(ShortcutsUpdate shortcutsUpdate) {
            shortcutsUpdate.getClass();
            this.payload_ = shortcutsUpdate;
            this.payloadCase_ = 33;
        }

        private void setVirtualDeviceList(VirtualDeviceList virtualDeviceList) {
            virtualDeviceList.getClass();
            this.payload_ = virtualDeviceList;
            this.payloadCase_ = 20;
        }

        private void setVirtualDeviceOpened(VirtualDeviceOpened virtualDeviceOpened) {
            virtualDeviceOpened.getClass();
            this.payload_ = virtualDeviceOpened;
            this.payloadCase_ = 21;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new ServerMessage();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0001(\n\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\n<\u0000\u0014<\u0000\u0015<\u0000\u001e<\u0000\u001f<\u0000 <\u0000!<\u0000(<\u0000", new Object[]{"payload_", "payloadCase_", Error.class, Ok.class, HelloFromServer.class, VirtualDeviceList.class, VirtualDeviceOpened.class, Context.class, ContextUpdate.class, Shortcuts.class, ShortcutsUpdate.class, Icon.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (ServerMessage.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public Context getContext() {
            return this.payloadCase_ == 30 ? (Context) this.payload_ : Context.getDefaultInstance();
        }

        public ContextUpdate getContextUpdate() {
            return this.payloadCase_ == 31 ? (ContextUpdate) this.payload_ : ContextUpdate.getDefaultInstance();
        }

        public Error getError() {
            return this.payloadCase_ == 1 ? (Error) this.payload_ : Error.getDefaultInstance();
        }

        public HelloFromServer getHello() {
            return this.payloadCase_ == 10 ? (HelloFromServer) this.payload_ : HelloFromServer.getDefaultInstance();
        }

        public Icon getIcon() {
            return this.payloadCase_ == 40 ? (Icon) this.payload_ : Icon.getDefaultInstance();
        }

        public Ok getOk() {
            return this.payloadCase_ == 2 ? (Ok) this.payload_ : Ok.getDefaultInstance();
        }

        public b getPayloadCase() {
            return b.b(this.payloadCase_);
        }

        public Shortcuts getShortcuts() {
            return this.payloadCase_ == 32 ? (Shortcuts) this.payload_ : Shortcuts.getDefaultInstance();
        }

        public ShortcutsUpdate getShortcutsUpdate() {
            return this.payloadCase_ == 33 ? (ShortcutsUpdate) this.payload_ : ShortcutsUpdate.getDefaultInstance();
        }

        public VirtualDeviceList getVirtualDeviceList() {
            return this.payloadCase_ == 20 ? (VirtualDeviceList) this.payload_ : VirtualDeviceList.getDefaultInstance();
        }

        public VirtualDeviceOpened getVirtualDeviceOpened() {
            return this.payloadCase_ == 21 ? (VirtualDeviceOpened) this.payload_ : VirtualDeviceOpened.getDefaultInstance();
        }

        public boolean hasContext() {
            return this.payloadCase_ == 30;
        }

        public boolean hasContextUpdate() {
            return this.payloadCase_ == 31;
        }

        public boolean hasError() {
            return this.payloadCase_ == 1;
        }

        public boolean hasHello() {
            return this.payloadCase_ == 10;
        }

        public boolean hasIcon() {
            return this.payloadCase_ == 40;
        }

        public boolean hasOk() {
            return this.payloadCase_ == 2;
        }

        public boolean hasShortcuts() {
            return this.payloadCase_ == 32;
        }

        public boolean hasShortcutsUpdate() {
            return this.payloadCase_ == 33;
        }

        public boolean hasVirtualDeviceList() {
            return this.payloadCase_ == 20;
        }

        public boolean hasVirtualDeviceOpened() {
            return this.payloadCase_ == 21;
        }

        public static a newBuilder(ServerMessage serverMessage) {
            return (a) DEFAULT_INSTANCE.createBuilder(serverMessage);
        }

        public static ServerMessage parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (ServerMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static ServerMessage parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (ServerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static ServerMessage parseFrom(AbstractC2097h abstractC2097h) {
            return (ServerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static ServerMessage parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (ServerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static ServerMessage parseFrom(byte[] bArr) {
            return (ServerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ServerMessage parseFrom(byte[] bArr, C2106q c2106q) {
            return (ServerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static ServerMessage parseFrom(InputStream inputStream) {
            return (ServerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServerMessage parseFrom(InputStream inputStream, C2106q c2106q) {
            return (ServerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static ServerMessage parseFrom(AbstractC2098i abstractC2098i) {
            return (ServerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static ServerMessage parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (ServerMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class ServiceEndpoints extends GeneratedMessageLite implements U {
        public static final int ADDRESSES_FIELD_NUMBER = 1;
        private static final ServiceEndpoints DEFAULT_INSTANCE;
        private static volatile g0 PARSER = null;
        public static final int PORT_FIELD_NUMBER = 2;
        private A.j addresses_ = GeneratedMessageLite.emptyProtobufList();
        private int port_;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a() {
                super(ServiceEndpoints.DEFAULT_INSTANCE);
            }
        }

        static {
            ServiceEndpoints serviceEndpoints = new ServiceEndpoints();
            DEFAULT_INSTANCE = serviceEndpoints;
            GeneratedMessageLite.registerDefaultInstance(ServiceEndpoints.class, serviceEndpoints);
        }

        private ServiceEndpoints() {
        }

        private void addAddresses(String str) {
            str.getClass();
            ensureAddressesIsMutable();
            this.addresses_.add(str);
        }

        private void addAddressesBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            ensureAddressesIsMutable();
            this.addresses_.add(abstractC2097h.T());
        }

        private void addAllAddresses(Iterable<String> iterable) {
            ensureAddressesIsMutable();
            AbstractC2086a.addAll((Iterable) iterable, (List) this.addresses_);
        }

        private void clearAddresses() {
            this.addresses_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearPort() {
            this.port_ = 0;
        }

        private void ensureAddressesIsMutable() {
            A.j jVar = this.addresses_;
            if (jVar.C()) {
                return;
            }
            this.addresses_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        public static ServiceEndpoints getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static ServiceEndpoints parseDelimitedFrom(InputStream inputStream) {
            return (ServiceEndpoints) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServiceEndpoints parseFrom(ByteBuffer byteBuffer) {
            return (ServiceEndpoints) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAddresses(int i8, String str) {
            str.getClass();
            ensureAddressesIsMutable();
            this.addresses_.set(i8, str);
        }

        private void setPort(int i8) {
            this.port_ = i8;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new ServiceEndpoints();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002\u000b", new Object[]{"addresses_", "port_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (ServiceEndpoints.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getAddresses(int i8) {
            return (String) this.addresses_.get(i8);
        }

        public AbstractC2097h getAddressesBytes(int i8) {
            return AbstractC2097h.E((String) this.addresses_.get(i8));
        }

        public int getAddressesCount() {
            return this.addresses_.size();
        }

        public List<String> getAddressesList() {
            return this.addresses_;
        }

        public int getPort() {
            return this.port_;
        }

        public static a newBuilder(ServiceEndpoints serviceEndpoints) {
            return (a) DEFAULT_INSTANCE.createBuilder(serviceEndpoints);
        }

        public static ServiceEndpoints parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (ServiceEndpoints) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static ServiceEndpoints parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (ServiceEndpoints) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static ServiceEndpoints parseFrom(AbstractC2097h abstractC2097h) {
            return (ServiceEndpoints) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static ServiceEndpoints parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (ServiceEndpoints) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static ServiceEndpoints parseFrom(byte[] bArr) {
            return (ServiceEndpoints) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ServiceEndpoints parseFrom(byte[] bArr, C2106q c2106q) {
            return (ServiceEndpoints) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static ServiceEndpoints parseFrom(InputStream inputStream) {
            return (ServiceEndpoints) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServiceEndpoints parseFrom(InputStream inputStream, C2106q c2106q) {
            return (ServiceEndpoints) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static ServiceEndpoints parseFrom(AbstractC2098i abstractC2098i) {
            return (ServiceEndpoints) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static ServiceEndpoints parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (ServiceEndpoints) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Shortcut extends GeneratedMessageLite implements e {
        public static final int CATEGORY_FIELD_NUMBER = 4;
        private static final Shortcut DEFAULT_INSTANCE;
        public static final int ICON_FIELD_NUMBER = 5;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 3;
        private static volatile g0 PARSER = null;
        public static final int TITLE_FIELD_NUMBER = 2;
        private int bitField0_;
        private Image icon_;
        private String id_ = "";
        private String title_ = "";
        private String name_ = "";
        private String category_ = "";

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements e {
            public a() {
                super(Shortcut.DEFAULT_INSTANCE);
            }
        }

        static {
            Shortcut shortcut = new Shortcut();
            DEFAULT_INSTANCE = shortcut;
            GeneratedMessageLite.registerDefaultInstance(Shortcut.class, shortcut);
        }

        private Shortcut() {
        }

        private void clearCategory() {
            this.category_ = getDefaultInstance().getCategory();
        }

        private void clearIcon() {
            this.icon_ = null;
            this.bitField0_ &= -2;
        }

        private void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        private void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        private void clearTitle() {
            this.title_ = getDefaultInstance().getTitle();
        }

        public static Shortcut getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeIcon(Image image) {
            image.getClass();
            Image image2 = this.icon_;
            if (image2 == null || image2 == Image.getDefaultInstance()) {
                this.icon_ = image;
            } else {
                this.icon_ = (Image) ((Image.a) Image.newBuilder(this.icon_).mergeFrom((GeneratedMessageLite) image)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Shortcut parseDelimitedFrom(InputStream inputStream) {
            return (Shortcut) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Shortcut parseFrom(ByteBuffer byteBuffer) {
            return (Shortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCategory(String str) {
            str.getClass();
            this.category_ = str;
        }

        private void setCategoryBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.category_ = abstractC2097h.T();
        }

        private void setIcon(Image image) {
            image.getClass();
            this.icon_ = image;
            this.bitField0_ |= 1;
        }

        private void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        private void setIdBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.id_ = abstractC2097h.T();
        }

        private void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        private void setNameBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.name_ = abstractC2097h.T();
        }

        private void setTitle(String str) {
            str.getClass();
            this.title_ = str;
        }

        private void setTitleBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.title_ = abstractC2097h.T();
        }

        public String getCategory() {
            return this.category_;
        }

        public AbstractC2097h getCategoryBytes() {
            return AbstractC2097h.E(this.category_);
        }

        public Image getIcon() {
            Image image = this.icon_;
            return image == null ? Image.getDefaultInstance() : image;
        }

        public String getId() {
            return this.id_;
        }

        public AbstractC2097h getIdBytes() {
            return AbstractC2097h.E(this.id_);
        }

        public String getName() {
            return this.name_;
        }

        public AbstractC2097h getNameBytes() {
            return AbstractC2097h.E(this.name_);
        }

        public String getTitle() {
            return this.title_;
        }

        public AbstractC2097h getTitleBytes() {
            return AbstractC2097h.E(this.title_);
        }

        public boolean hasIcon() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(Shortcut shortcut) {
            return (a) DEFAULT_INSTANCE.createBuilder(shortcut);
        }

        public static Shortcut parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (Shortcut) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static Shortcut parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (Shortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new Shortcut();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005ဉ\u0000", new Object[]{"bitField0_", OjEsfyJYzbPn.LynxJAqELsop, "title_", "name_", "category_", "icon_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (Shortcut.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static Shortcut parseFrom(AbstractC2097h abstractC2097h) {
            return (Shortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static Shortcut parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (Shortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static Shortcut parseFrom(byte[] bArr) {
            return (Shortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Shortcut parseFrom(byte[] bArr, C2106q c2106q) {
            return (Shortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static Shortcut parseFrom(InputStream inputStream) {
            return (Shortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Shortcut parseFrom(InputStream inputStream, C2106q c2106q) {
            return (Shortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static Shortcut parseFrom(AbstractC2098i abstractC2098i) {
            return (Shortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static Shortcut parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (Shortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Shortcuts extends GeneratedMessageLite implements U {
        private static final Shortcuts DEFAULT_INSTANCE;
        private static volatile g0 PARSER = null;
        public static final int SHORTCUTS_FIELD_NUMBER = 1;
        private A.j shortcuts_ = GeneratedMessageLite.emptyProtobufList();

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a() {
                super(Shortcuts.DEFAULT_INSTANCE);
            }
        }

        static {
            Shortcuts shortcuts = new Shortcuts();
            DEFAULT_INSTANCE = shortcuts;
            GeneratedMessageLite.registerDefaultInstance(Shortcuts.class, shortcuts);
        }

        private Shortcuts() {
        }

        private void addAllShortcuts(Iterable<? extends Shortcut> iterable) {
            ensureShortcutsIsMutable();
            AbstractC2086a.addAll((Iterable) iterable, (List) this.shortcuts_);
        }

        private void addShortcuts(Shortcut shortcut) {
            shortcut.getClass();
            ensureShortcutsIsMutable();
            this.shortcuts_.add(shortcut);
        }

        private void clearShortcuts() {
            this.shortcuts_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureShortcutsIsMutable() {
            A.j jVar = this.shortcuts_;
            if (jVar.C()) {
                return;
            }
            this.shortcuts_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        public static Shortcuts getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Shortcuts parseDelimitedFrom(InputStream inputStream) {
            return (Shortcuts) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Shortcuts parseFrom(ByteBuffer byteBuffer) {
            return (Shortcuts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeShortcuts(int i8) {
            ensureShortcutsIsMutable();
            this.shortcuts_.remove(i8);
        }

        private void setShortcuts(int i8, Shortcut shortcut) {
            shortcut.getClass();
            ensureShortcutsIsMutable();
            this.shortcuts_.set(i8, shortcut);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new Shortcuts();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"shortcuts_", Shortcut.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (Shortcuts.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public Shortcut getShortcuts(int i8) {
            return (Shortcut) this.shortcuts_.get(i8);
        }

        public int getShortcutsCount() {
            return this.shortcuts_.size();
        }

        public List<Shortcut> getShortcutsList() {
            return this.shortcuts_;
        }

        public e getShortcutsOrBuilder(int i8) {
            return (e) this.shortcuts_.get(i8);
        }

        public List<? extends e> getShortcutsOrBuilderList() {
            return this.shortcuts_;
        }

        public static a newBuilder(Shortcuts shortcuts) {
            return (a) DEFAULT_INSTANCE.createBuilder(shortcuts);
        }

        public static Shortcuts parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (Shortcuts) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static Shortcuts parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (Shortcuts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static Shortcuts parseFrom(AbstractC2097h abstractC2097h) {
            return (Shortcuts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        private void addShortcuts(int i8, Shortcut shortcut) {
            shortcut.getClass();
            ensureShortcutsIsMutable();
            this.shortcuts_.add(i8, shortcut);
        }

        public static Shortcuts parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (Shortcuts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static Shortcuts parseFrom(byte[] bArr) {
            return (Shortcuts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Shortcuts parseFrom(byte[] bArr, C2106q c2106q) {
            return (Shortcuts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static Shortcuts parseFrom(InputStream inputStream) {
            return (Shortcuts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Shortcuts parseFrom(InputStream inputStream, C2106q c2106q) {
            return (Shortcuts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static Shortcuts parseFrom(AbstractC2098i abstractC2098i) {
            return (Shortcuts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static Shortcuts parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (Shortcuts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class ShortcutsUpdate extends GeneratedMessageLite implements U {
        private static final ShortcutsUpdate DEFAULT_INSTANCE;
        private static volatile g0 PARSER = null;
        public static final int REMOVE_FIELD_NUMBER = 2;
        public static final int REPLACE_FIELD_NUMBER = 1;
        private A.j replace_ = GeneratedMessageLite.emptyProtobufList();
        private A.j remove_ = GeneratedMessageLite.emptyProtobufList();

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a() {
                super(ShortcutsUpdate.DEFAULT_INSTANCE);
            }
        }

        static {
            ShortcutsUpdate shortcutsUpdate = new ShortcutsUpdate();
            DEFAULT_INSTANCE = shortcutsUpdate;
            GeneratedMessageLite.registerDefaultInstance(ShortcutsUpdate.class, shortcutsUpdate);
        }

        private ShortcutsUpdate() {
        }

        private void addAllRemove(Iterable<String> iterable) {
            ensureRemoveIsMutable();
            AbstractC2086a.addAll((Iterable) iterable, (List) this.remove_);
        }

        private void addAllReplace(Iterable<? extends Shortcut> iterable) {
            ensureReplaceIsMutable();
            AbstractC2086a.addAll((Iterable) iterable, (List) this.replace_);
        }

        private void addRemove(String str) {
            str.getClass();
            ensureRemoveIsMutable();
            this.remove_.add(str);
        }

        private void addRemoveBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            ensureRemoveIsMutable();
            this.remove_.add(abstractC2097h.T());
        }

        private void addReplace(Shortcut shortcut) {
            shortcut.getClass();
            ensureReplaceIsMutable();
            this.replace_.add(shortcut);
        }

        private void clearRemove() {
            this.remove_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearReplace() {
            this.replace_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureRemoveIsMutable() {
            A.j jVar = this.remove_;
            if (jVar.C()) {
                return;
            }
            this.remove_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        private void ensureReplaceIsMutable() {
            A.j jVar = this.replace_;
            if (jVar.C()) {
                return;
            }
            this.replace_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        public static ShortcutsUpdate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static ShortcutsUpdate parseDelimitedFrom(InputStream inputStream) {
            return (ShortcutsUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ShortcutsUpdate parseFrom(ByteBuffer byteBuffer) {
            return (ShortcutsUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeReplace(int i8) {
            ensureReplaceIsMutable();
            this.replace_.remove(i8);
        }

        private void setRemove(int i8, String str) {
            str.getClass();
            ensureRemoveIsMutable();
            this.remove_.set(i8, str);
        }

        private void setReplace(int i8, Shortcut shortcut) {
            shortcut.getClass();
            ensureReplaceIsMutable();
            this.replace_.set(i8, shortcut);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new ShortcutsUpdate();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002Ț", new Object[]{"replace_", Shortcut.class, "remove_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (ShortcutsUpdate.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getRemove(int i8) {
            return (String) this.remove_.get(i8);
        }

        public AbstractC2097h getRemoveBytes(int i8) {
            return AbstractC2097h.E((String) this.remove_.get(i8));
        }

        public int getRemoveCount() {
            return this.remove_.size();
        }

        public List<String> getRemoveList() {
            return this.remove_;
        }

        public Shortcut getReplace(int i8) {
            return (Shortcut) this.replace_.get(i8);
        }

        public int getReplaceCount() {
            return this.replace_.size();
        }

        public List<Shortcut> getReplaceList() {
            return this.replace_;
        }

        public e getReplaceOrBuilder(int i8) {
            return (e) this.replace_.get(i8);
        }

        public List<? extends e> getReplaceOrBuilderList() {
            return this.replace_;
        }

        public static a newBuilder(ShortcutsUpdate shortcutsUpdate) {
            return (a) DEFAULT_INSTANCE.createBuilder(shortcutsUpdate);
        }

        public static ShortcutsUpdate parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (ShortcutsUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static ShortcutsUpdate parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (ShortcutsUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static ShortcutsUpdate parseFrom(AbstractC2097h abstractC2097h) {
            return (ShortcutsUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        private void addReplace(int i8, Shortcut shortcut) {
            shortcut.getClass();
            ensureReplaceIsMutable();
            this.replace_.add(i8, shortcut);
        }

        public static ShortcutsUpdate parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (ShortcutsUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static ShortcutsUpdate parseFrom(byte[] bArr) {
            return (ShortcutsUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ShortcutsUpdate parseFrom(byte[] bArr, C2106q c2106q) {
            return (ShortcutsUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static ShortcutsUpdate parseFrom(InputStream inputStream) {
            return (ShortcutsUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ShortcutsUpdate parseFrom(InputStream inputStream, C2106q c2106q) {
            return (ShortcutsUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static ShortcutsUpdate parseFrom(AbstractC2098i abstractC2098i) {
            return (ShortcutsUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static ShortcutsUpdate parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (ShortcutsUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Size extends GeneratedMessageLite implements U {
        private static final Size DEFAULT_INSTANCE;
        public static final int HEIGHT_FIELD_NUMBER = 2;
        private static volatile g0 PARSER = null;
        public static final int WIDTH_FIELD_NUMBER = 1;
        private int height_;
        private int width_;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a f(int i8) {
                copyOnWrite();
                ((Size) this.instance).setHeight(i8);
                return this;
            }

            public a g(int i8) {
                copyOnWrite();
                ((Size) this.instance).setWidth(i8);
                return this;
            }

            public a() {
                super(Size.DEFAULT_INSTANCE);
            }
        }

        static {
            Size size = new Size();
            DEFAULT_INSTANCE = size;
            GeneratedMessageLite.registerDefaultInstance(Size.class, size);
        }

        private Size() {
        }

        private void clearHeight() {
            this.height_ = 0;
        }

        private void clearWidth() {
            this.width_ = 0;
        }

        public static Size getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Size parseDelimitedFrom(InputStream inputStream) {
            return (Size) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Size parseFrom(ByteBuffer byteBuffer) {
            return (Size) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeight(int i8) {
            this.height_ = i8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWidth(int i8) {
            this.width_ = i8;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new Size();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"width_", "height_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (Size.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getHeight() {
            return this.height_;
        }

        public int getWidth() {
            return this.width_;
        }

        public static a newBuilder(Size size) {
            return (a) DEFAULT_INSTANCE.createBuilder(size);
        }

        public static Size parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (Size) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static Size parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (Size) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static Size parseFrom(AbstractC2097h abstractC2097h) {
            return (Size) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static Size parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (Size) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static Size parseFrom(byte[] bArr) {
            return (Size) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Size parseFrom(byte[] bArr, C2106q c2106q) {
            return (Size) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static Size parseFrom(InputStream inputStream) {
            return (Size) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Size parseFrom(InputStream inputStream, C2106q c2106q) {
            return (Size) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static Size parseFrom(AbstractC2098i abstractC2098i) {
            return (Size) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static Size parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (Size) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class TriggerShortcut extends GeneratedMessageLite implements U {
        private static final TriggerShortcut DEFAULT_INSTANCE;
        public static final int DEVICEID_FIELD_NUMBER = 1;
        private static volatile g0 PARSER = null;
        public static final int SHORTCUTID_FIELD_NUMBER = 2;
        private String deviceID_ = "";
        private String shortcutID_ = "";

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a() {
                super(TriggerShortcut.DEFAULT_INSTANCE);
            }
        }

        static {
            TriggerShortcut triggerShortcut = new TriggerShortcut();
            DEFAULT_INSTANCE = triggerShortcut;
            GeneratedMessageLite.registerDefaultInstance(TriggerShortcut.class, triggerShortcut);
        }

        private TriggerShortcut() {
        }

        private void clearDeviceID() {
            this.deviceID_ = getDefaultInstance().getDeviceID();
        }

        private void clearShortcutID() {
            this.shortcutID_ = getDefaultInstance().getShortcutID();
        }

        public static TriggerShortcut getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static TriggerShortcut parseDelimitedFrom(InputStream inputStream) {
            return (TriggerShortcut) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TriggerShortcut parseFrom(ByteBuffer byteBuffer) {
            return (TriggerShortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDeviceID(String str) {
            str.getClass();
            this.deviceID_ = str;
        }

        private void setDeviceIDBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.deviceID_ = abstractC2097h.T();
        }

        private void setShortcutID(String str) {
            str.getClass();
            this.shortcutID_ = str;
        }

        private void setShortcutIDBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.shortcutID_ = abstractC2097h.T();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new TriggerShortcut();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"deviceID_", "shortcutID_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (TriggerShortcut.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getDeviceID() {
            return this.deviceID_;
        }

        public AbstractC2097h getDeviceIDBytes() {
            return AbstractC2097h.E(this.deviceID_);
        }

        public String getShortcutID() {
            return this.shortcutID_;
        }

        public AbstractC2097h getShortcutIDBytes() {
            return AbstractC2097h.E(this.shortcutID_);
        }

        public static a newBuilder(TriggerShortcut triggerShortcut) {
            return (a) DEFAULT_INSTANCE.createBuilder(triggerShortcut);
        }

        public static TriggerShortcut parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (TriggerShortcut) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static TriggerShortcut parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (TriggerShortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static TriggerShortcut parseFrom(AbstractC2097h abstractC2097h) {
            return (TriggerShortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static TriggerShortcut parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (TriggerShortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static TriggerShortcut parseFrom(byte[] bArr) {
            return (TriggerShortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TriggerShortcut parseFrom(byte[] bArr, C2106q c2106q) {
            return (TriggerShortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static TriggerShortcut parseFrom(InputStream inputStream) {
            return (TriggerShortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TriggerShortcut parseFrom(InputStream inputStream, C2106q c2106q) {
            return (TriggerShortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static TriggerShortcut parseFrom(AbstractC2098i abstractC2098i) {
            return (TriggerShortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static TriggerShortcut parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (TriggerShortcut) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class UIntRange extends GeneratedMessageLite implements U {
        private static final UIntRange DEFAULT_INSTANCE;
        public static final int MAX_FIELD_NUMBER = 2;
        public static final int MIN_FIELD_NUMBER = 1;
        private static volatile g0 PARSER;
        private int max_;
        private int min_;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a() {
                super(UIntRange.DEFAULT_INSTANCE);
            }
        }

        static {
            UIntRange uIntRange = new UIntRange();
            DEFAULT_INSTANCE = uIntRange;
            GeneratedMessageLite.registerDefaultInstance(UIntRange.class, uIntRange);
        }

        private UIntRange() {
        }

        private void clearMax() {
            this.max_ = 0;
        }

        private void clearMin() {
            this.min_ = 0;
        }

        public static UIntRange getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static UIntRange parseDelimitedFrom(InputStream inputStream) {
            return (UIntRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UIntRange parseFrom(ByteBuffer byteBuffer) {
            return (UIntRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setMax(int i8) {
            this.max_ = i8;
        }

        private void setMin(int i8) {
            this.min_ = i8;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new UIntRange();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"min_", "max_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (UIntRange.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getMax() {
            return this.max_;
        }

        public int getMin() {
            return this.min_;
        }

        public static a newBuilder(UIntRange uIntRange) {
            return (a) DEFAULT_INSTANCE.createBuilder(uIntRange);
        }

        public static UIntRange parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (UIntRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static UIntRange parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (UIntRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static UIntRange parseFrom(AbstractC2097h abstractC2097h) {
            return (UIntRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static UIntRange parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (UIntRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static UIntRange parseFrom(byte[] bArr) {
            return (UIntRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UIntRange parseFrom(byte[] bArr, C2106q c2106q) {
            return (UIntRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static UIntRange parseFrom(InputStream inputStream) {
            return (UIntRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UIntRange parseFrom(InputStream inputStream, C2106q c2106q) {
            return (UIntRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static UIntRange parseFrom(AbstractC2098i abstractC2098i) {
            return (UIntRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static UIntRange parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (UIntRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class UpdateKeypadConfig extends GeneratedMessageLite implements U {
        private static final UpdateKeypadConfig DEFAULT_INSTANCE;
        public static final int HIGHDPI_FIELD_NUMBER = 3;
        public static final int ICONSIZE_FIELD_NUMBER = 1;
        public static final int LAYOUTCROP_FIELD_NUMBER = 4;
        private static volatile g0 PARSER = null;
        public static final int PRESSEDICONSIZE_FIELD_NUMBER = 2;
        private int bitField0_;
        private boolean highDPI_;
        private Size iconSize_;
        private Size layoutCrop_;
        private Size pressedIconSize_;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a f(boolean z8) {
                copyOnWrite();
                ((UpdateKeypadConfig) this.instance).setHighDPI(z8);
                return this;
            }

            public a g(Size size) {
                copyOnWrite();
                ((UpdateKeypadConfig) this.instance).setIconSize(size);
                return this;
            }

            public a h(Size size) {
                copyOnWrite();
                ((UpdateKeypadConfig) this.instance).setLayoutCrop(size);
                return this;
            }

            public a() {
                super(UpdateKeypadConfig.DEFAULT_INSTANCE);
            }
        }

        static {
            UpdateKeypadConfig updateKeypadConfig = new UpdateKeypadConfig();
            DEFAULT_INSTANCE = updateKeypadConfig;
            GeneratedMessageLite.registerDefaultInstance(UpdateKeypadConfig.class, updateKeypadConfig);
        }

        private UpdateKeypadConfig() {
        }

        private void clearHighDPI() {
            this.bitField0_ &= -5;
            this.highDPI_ = false;
        }

        private void clearIconSize() {
            this.iconSize_ = null;
            this.bitField0_ &= -2;
        }

        private void clearLayoutCrop() {
            this.layoutCrop_ = null;
            this.bitField0_ &= -9;
        }

        private void clearPressedIconSize() {
            this.pressedIconSize_ = null;
            this.bitField0_ &= -3;
        }

        public static UpdateKeypadConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeIconSize(Size size) {
            size.getClass();
            Size size2 = this.iconSize_;
            if (size2 == null || size2 == Size.getDefaultInstance()) {
                this.iconSize_ = size;
            } else {
                this.iconSize_ = (Size) ((Size.a) Size.newBuilder(this.iconSize_).mergeFrom((GeneratedMessageLite) size)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeLayoutCrop(Size size) {
            size.getClass();
            Size size2 = this.layoutCrop_;
            if (size2 == null || size2 == Size.getDefaultInstance()) {
                this.layoutCrop_ = size;
            } else {
                this.layoutCrop_ = (Size) ((Size.a) Size.newBuilder(this.layoutCrop_).mergeFrom((GeneratedMessageLite) size)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        private void mergePressedIconSize(Size size) {
            size.getClass();
            Size size2 = this.pressedIconSize_;
            if (size2 == null || size2 == Size.getDefaultInstance()) {
                this.pressedIconSize_ = size;
            } else {
                this.pressedIconSize_ = (Size) ((Size.a) Size.newBuilder(this.pressedIconSize_).mergeFrom((GeneratedMessageLite) size)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static UpdateKeypadConfig parseDelimitedFrom(InputStream inputStream) {
            return (UpdateKeypadConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UpdateKeypadConfig parseFrom(ByteBuffer byteBuffer) {
            return (UpdateKeypadConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHighDPI(boolean z8) {
            this.bitField0_ |= 4;
            this.highDPI_ = z8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconSize(Size size) {
            size.getClass();
            this.iconSize_ = size;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLayoutCrop(Size size) {
            size.getClass();
            this.layoutCrop_ = size;
            this.bitField0_ |= 8;
        }

        private void setPressedIconSize(Size size) {
            size.getClass();
            this.pressedIconSize_ = size;
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new UpdateKeypadConfig();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "iconSize_", "pressedIconSize_", "highDPI_", "layoutCrop_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (UpdateKeypadConfig.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public boolean getHighDPI() {
            return this.highDPI_;
        }

        public Size getIconSize() {
            Size size = this.iconSize_;
            return size == null ? Size.getDefaultInstance() : size;
        }

        public Size getLayoutCrop() {
            Size size = this.layoutCrop_;
            return size == null ? Size.getDefaultInstance() : size;
        }

        public Size getPressedIconSize() {
            Size size = this.pressedIconSize_;
            return size == null ? Size.getDefaultInstance() : size;
        }

        public boolean hasHighDPI() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasIconSize() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasLayoutCrop() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasPressedIconSize() {
            return (this.bitField0_ & 2) != 0;
        }

        public static a newBuilder(UpdateKeypadConfig updateKeypadConfig) {
            return (a) DEFAULT_INSTANCE.createBuilder(updateKeypadConfig);
        }

        public static UpdateKeypadConfig parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (UpdateKeypadConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static UpdateKeypadConfig parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (UpdateKeypadConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static UpdateKeypadConfig parseFrom(AbstractC2097h abstractC2097h) {
            return (UpdateKeypadConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static UpdateKeypadConfig parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (UpdateKeypadConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static UpdateKeypadConfig parseFrom(byte[] bArr) {
            return (UpdateKeypadConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UpdateKeypadConfig parseFrom(byte[] bArr, C2106q c2106q) {
            return (UpdateKeypadConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static UpdateKeypadConfig parseFrom(InputStream inputStream) {
            return (UpdateKeypadConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UpdateKeypadConfig parseFrom(InputStream inputStream, C2106q c2106q) {
            return (UpdateKeypadConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static UpdateKeypadConfig parseFrom(AbstractC2098i abstractC2098i) {
            return (UpdateKeypadConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static UpdateKeypadConfig parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (UpdateKeypadConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class VirtualDevice extends GeneratedMessageLite implements f {
        private static final VirtualDevice DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile g0 PARSER;
        private String id_ = "";
        private String name_ = "";

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements f {
            public a() {
                super(VirtualDevice.DEFAULT_INSTANCE);
            }
        }

        static {
            VirtualDevice virtualDevice = new VirtualDevice();
            DEFAULT_INSTANCE = virtualDevice;
            GeneratedMessageLite.registerDefaultInstance(VirtualDevice.class, virtualDevice);
        }

        private VirtualDevice() {
        }

        private void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        private void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        public static VirtualDevice getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static VirtualDevice parseDelimitedFrom(InputStream inputStream) {
            return (VirtualDevice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VirtualDevice parseFrom(ByteBuffer byteBuffer) {
            return (VirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        private void setIdBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.id_ = abstractC2097h.T();
        }

        private void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        private void setNameBytes(AbstractC2097h abstractC2097h) {
            AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
            this.name_ = abstractC2097h.T();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new VirtualDevice();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"id_", "name_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (VirtualDevice.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getId() {
            return this.id_;
        }

        public AbstractC2097h getIdBytes() {
            return AbstractC2097h.E(this.id_);
        }

        public String getName() {
            return this.name_;
        }

        public AbstractC2097h getNameBytes() {
            return AbstractC2097h.E(this.name_);
        }

        public static a newBuilder(VirtualDevice virtualDevice) {
            return (a) DEFAULT_INSTANCE.createBuilder(virtualDevice);
        }

        public static VirtualDevice parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (VirtualDevice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static VirtualDevice parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (VirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static VirtualDevice parseFrom(AbstractC2097h abstractC2097h) {
            return (VirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static VirtualDevice parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (VirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static VirtualDevice parseFrom(byte[] bArr) {
            return (VirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VirtualDevice parseFrom(byte[] bArr, C2106q c2106q) {
            return (VirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static VirtualDevice parseFrom(InputStream inputStream) {
            return (VirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VirtualDevice parseFrom(InputStream inputStream, C2106q c2106q) {
            return (VirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static VirtualDevice parseFrom(AbstractC2098i abstractC2098i) {
            return (VirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static VirtualDevice parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (VirtualDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class VirtualDeviceList extends GeneratedMessageLite implements U {
        private static final VirtualDeviceList DEFAULT_INSTANCE;
        public static final int DEVICES_FIELD_NUMBER = 1;
        private static volatile g0 PARSER;
        private A.j devices_ = GeneratedMessageLite.emptyProtobufList();

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a() {
                super(VirtualDeviceList.DEFAULT_INSTANCE);
            }
        }

        static {
            VirtualDeviceList virtualDeviceList = new VirtualDeviceList();
            DEFAULT_INSTANCE = virtualDeviceList;
            GeneratedMessageLite.registerDefaultInstance(VirtualDeviceList.class, virtualDeviceList);
        }

        private VirtualDeviceList() {
        }

        private void addAllDevices(Iterable<? extends VirtualDevice> iterable) {
            ensureDevicesIsMutable();
            AbstractC2086a.addAll((Iterable) iterable, (List) this.devices_);
        }

        private void addDevices(VirtualDevice virtualDevice) {
            virtualDevice.getClass();
            ensureDevicesIsMutable();
            this.devices_.add(virtualDevice);
        }

        private void clearDevices() {
            this.devices_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureDevicesIsMutable() {
            A.j jVar = this.devices_;
            if (jVar.C()) {
                return;
            }
            this.devices_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        public static VirtualDeviceList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static VirtualDeviceList parseDelimitedFrom(InputStream inputStream) {
            return (VirtualDeviceList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VirtualDeviceList parseFrom(ByteBuffer byteBuffer) {
            return (VirtualDeviceList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeDevices(int i8) {
            ensureDevicesIsMutable();
            this.devices_.remove(i8);
        }

        private void setDevices(int i8, VirtualDevice virtualDevice) {
            virtualDevice.getClass();
            ensureDevicesIsMutable();
            this.devices_.set(i8, virtualDevice);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new VirtualDeviceList();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"devices_", VirtualDevice.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (VirtualDeviceList.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public VirtualDevice getDevices(int i8) {
            return (VirtualDevice) this.devices_.get(i8);
        }

        public int getDevicesCount() {
            return this.devices_.size();
        }

        public List<VirtualDevice> getDevicesList() {
            return this.devices_;
        }

        public f getDevicesOrBuilder(int i8) {
            return (f) this.devices_.get(i8);
        }

        public List<? extends f> getDevicesOrBuilderList() {
            return this.devices_;
        }

        public static a newBuilder(VirtualDeviceList virtualDeviceList) {
            return (a) DEFAULT_INSTANCE.createBuilder(virtualDeviceList);
        }

        public static VirtualDeviceList parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (VirtualDeviceList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static VirtualDeviceList parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (VirtualDeviceList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static VirtualDeviceList parseFrom(AbstractC2097h abstractC2097h) {
            return (VirtualDeviceList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        private void addDevices(int i8, VirtualDevice virtualDevice) {
            virtualDevice.getClass();
            ensureDevicesIsMutable();
            this.devices_.add(i8, virtualDevice);
        }

        public static VirtualDeviceList parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (VirtualDeviceList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static VirtualDeviceList parseFrom(byte[] bArr) {
            return (VirtualDeviceList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VirtualDeviceList parseFrom(byte[] bArr, C2106q c2106q) {
            return (VirtualDeviceList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static VirtualDeviceList parseFrom(InputStream inputStream) {
            return (VirtualDeviceList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VirtualDeviceList parseFrom(InputStream inputStream, C2106q c2106q) {
            return (VirtualDeviceList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static VirtualDeviceList parseFrom(AbstractC2098i abstractC2098i) {
            return (VirtualDeviceList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static VirtualDeviceList parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (VirtualDeviceList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class VirtualDeviceOpened extends GeneratedMessageLite implements U {
        private static final VirtualDeviceOpened DEFAULT_INSTANCE;
        public static final int DEVICE_FIELD_NUMBER = 2;
        private static volatile g0 PARSER = null;
        public static final int REQUESTID_FIELD_NUMBER = 1;
        private int bitField0_;
        private VirtualDevice device_;
        private int requestID_;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends GeneratedMessageLite.b implements U {
            public a() {
                super(VirtualDeviceOpened.DEFAULT_INSTANCE);
            }
        }

        static {
            VirtualDeviceOpened virtualDeviceOpened = new VirtualDeviceOpened();
            DEFAULT_INSTANCE = virtualDeviceOpened;
            GeneratedMessageLite.registerDefaultInstance(VirtualDeviceOpened.class, virtualDeviceOpened);
        }

        private VirtualDeviceOpened() {
        }

        private void clearDevice() {
            this.device_ = null;
            this.bitField0_ &= -2;
        }

        private void clearRequestID() {
            this.requestID_ = 0;
        }

        public static VirtualDeviceOpened getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeDevice(VirtualDevice virtualDevice) {
            virtualDevice.getClass();
            VirtualDevice virtualDevice2 = this.device_;
            if (virtualDevice2 == null || virtualDevice2 == VirtualDevice.getDefaultInstance()) {
                this.device_ = virtualDevice;
            } else {
                this.device_ = (VirtualDevice) ((VirtualDevice.a) VirtualDevice.newBuilder(this.device_).mergeFrom((GeneratedMessageLite) virtualDevice)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static VirtualDeviceOpened parseDelimitedFrom(InputStream inputStream) {
            return (VirtualDeviceOpened) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VirtualDeviceOpened parseFrom(ByteBuffer byteBuffer) {
            return (VirtualDeviceOpened) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static g0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDevice(VirtualDevice virtualDevice) {
            virtualDevice.getClass();
            this.device_ = virtualDevice;
            this.bitField0_ |= 1;
        }

        private void setRequestID(int i8) {
            this.requestID_ = i8;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            g0 cVar;
            switch (a.f17767a[fVar.ordinal()]) {
                case 1:
                    return new VirtualDeviceOpened();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "requestID_", "device_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    g0 g0Var = PARSER;
                    if (g0Var != null) {
                        return g0Var;
                    }
                    synchronized (VirtualDeviceOpened.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public VirtualDevice getDevice() {
            VirtualDevice virtualDevice = this.device_;
            return virtualDevice == null ? VirtualDevice.getDefaultInstance() : virtualDevice;
        }

        public int getRequestID() {
            return this.requestID_;
        }

        public boolean hasDevice() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(VirtualDeviceOpened virtualDeviceOpened) {
            return (a) DEFAULT_INSTANCE.createBuilder(virtualDeviceOpened);
        }

        public static VirtualDeviceOpened parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
            return (VirtualDeviceOpened) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static VirtualDeviceOpened parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
            return (VirtualDeviceOpened) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
        }

        public static VirtualDeviceOpened parseFrom(AbstractC2097h abstractC2097h) {
            return (VirtualDeviceOpened) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
        }

        public static VirtualDeviceOpened parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
            return (VirtualDeviceOpened) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
        }

        public static VirtualDeviceOpened parseFrom(byte[] bArr) {
            return (VirtualDeviceOpened) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VirtualDeviceOpened parseFrom(byte[] bArr, C2106q c2106q) {
            return (VirtualDeviceOpened) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
        }

        public static VirtualDeviceOpened parseFrom(InputStream inputStream) {
            return (VirtualDeviceOpened) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VirtualDeviceOpened parseFrom(InputStream inputStream, C2106q c2106q) {
            return (VirtualDeviceOpened) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
        }

        public static VirtualDeviceOpened parseFrom(AbstractC2098i abstractC2098i) {
            return (VirtualDeviceOpened) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
        }

        public static VirtualDeviceOpened parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
            return (VirtualDeviceOpened) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17767a;

        static {
            int[] iArr = new int[GeneratedMessageLite.f.values().length];
            f17767a = iArr;
            try {
                iArr[GeneratedMessageLite.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17767a[GeneratedMessageLite.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17767a[GeneratedMessageLite.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17767a[GeneratedMessageLite.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17767a[GeneratedMessageLite.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17767a[GeneratedMessageLite.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17767a[GeneratedMessageLite.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b extends U {
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum c implements A.c {
        LZF(0),
        LZFSE(1),
        LZ4(2),
        BMP(3),
        f17772f(4),
        PNG(5),
        Invalid(100),
        f17775i(-1);


        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final A.d f17776j = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17778a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class a implements A.d {
            @Override // com.google.protobuf.A.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c findValueByNumber(int i8) {
                return c.b(i8);
            }
        }

        c(int i8) {
            this.f17778a = i8;
        }

        public static c b(int i8) {
            if (i8 == 0) {
                return LZF;
            }
            if (i8 == 1) {
                return LZFSE;
            }
            if (i8 == 2) {
                return LZ4;
            }
            if (i8 == 3) {
                return BMP;
            }
            if (i8 == 4) {
                return f17772f;
            }
            if (i8 == 5) {
                return PNG;
            }
            if (i8 != 100) {
                return null;
            }
            return Invalid;
        }

        @Override // com.google.protobuf.A.c
        public final int getNumber() {
            if (this != f17775i) {
                return this.f17778a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum d implements A.c {
        Opaque(0),
        Transparent(1),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final A.d f17782e = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17784a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class a implements A.d {
            @Override // com.google.protobuf.A.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d findValueByNumber(int i8) {
                return d.b(i8);
            }
        }

        d(int i8) {
            this.f17784a = i8;
        }

        public static d b(int i8) {
            if (i8 == 0) {
                return Opaque;
            }
            if (i8 != 1) {
                return null;
            }
            return Transparent;
        }

        @Override // com.google.protobuf.A.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f17784a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface e extends U {
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface f extends U {
    }

    private Messages() {
    }

    public static void registerAllExtensions(C2106q c2106q) {
    }
}
