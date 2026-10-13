package com.elgato.streamdeck.vsd2.connection;

import com.elgato.vsd2.Messages;
import com.google.protobuf.AbstractC2097h;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoBox f17676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoBox.KeyPair f17677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f17678c;

    public a(CryptoBox cryptoBox, CryptoBox.KeyPair keyPair) {
        t.g(cryptoBox, "cryptoBox");
        t.g(keyPair, "keyPair");
        this.f17676a = cryptoBox;
        this.f17677b = keyPair;
    }

    public final byte[] a(Messages.ClientMessage message) {
        t.g(message, "message");
        byte[] byteArray = message.toByteArray();
        if (message.getPayloadCase() == Messages.ClientMessage.b.HELLO) {
            if (this.f17678c != null) {
                throw new IllegalStateException("Protocol violation: Hello was already sent.");
            }
            byte[] byteArray2 = ((Messages.ClientMessage) ((Messages.ClientMessage.a) message.toBuilder()).l(((Messages.HelloFromClient.a) message.getHello().toBuilder()).g(AbstractC2097h.A(this.f17677b.getPublicKey()))).build()).toByteArray();
            t.f(byteArray2, "toByteArray(...)");
            return byteArray2;
        }
        byte[] bArr = this.f17678c;
        if (bArr == null) {
            throw new IllegalStateException("Protocol violation: Handshake has to be completed first.");
        }
        CryptoBox cryptoBox = this.f17676a;
        t.d(byteArray);
        return cryptoBox.encrypt(byteArray, bArr);
    }

    public final Messages.ServerMessage b(byte[] data) {
        byte[] bArrDecrypt;
        t.g(data, "data");
        byte[] bArr = this.f17678c;
        if (bArr != null && (bArrDecrypt = this.f17676a.decrypt(data, bArr)) != null) {
            data = bArrDecrypt;
        }
        Messages.ServerMessage from = Messages.ServerMessage.parseFrom(data);
        if (this.f17678c == null) {
            if (from.getPayloadCase() != Messages.ServerMessage.b.HELLO) {
                throw new IllegalStateException("Protocol violation: Hello message expected.");
            }
            CryptoBox cryptoBox = this.f17676a;
            byte[] bArrP = from.getHello().getPublicKey().P();
            t.f(bArrP, "toByteArray(...)");
            this.f17678c = cryptoBox.calculateSharedKey(new CryptoBox.KeyPair(bArrP, this.f17677b.getSecretKey()));
        }
        t.d(from);
        return from;
    }
}
