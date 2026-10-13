package M0;

import C6.v;
import D6.M;
import com.amazon.a.a.b.a.dXIE.uYOhHhTXuF;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f5069a = M.i(v.a(j.EmailAddress, "emailAddress"), v.a(j.Username, "username"), v.a(j.Password, "password"), v.a(j.NewUsername, "newUsername"), v.a(j.NewPassword, "newPassword"), v.a(j.PostalAddress, "postalAddress"), v.a(j.PostalCode, "postalCode"), v.a(j.CreditCardNumber, "creditCardNumber"), v.a(j.CreditCardSecurityCode, "creditCardSecurityCode"), v.a(j.CreditCardExpirationDate, "creditCardExpirationDate"), v.a(j.CreditCardExpirationMonth, "creditCardExpirationMonth"), v.a(j.CreditCardExpirationYear, "creditCardExpirationYear"), v.a(j.CreditCardExpirationDay, "creditCardExpirationDay"), v.a(j.AddressCountry, "addressCountry"), v.a(j.AddressRegion, "addressRegion"), v.a(j.AddressLocality, "addressLocality"), v.a(j.AddressStreet, "streetAddress"), v.a(j.AddressAuxiliaryDetails, "extendedAddress"), v.a(j.PostalCodeExtended, "extendedPostalCode"), v.a(j.PersonFullName, "personName"), v.a(j.PersonFirstName, "personGivenName"), v.a(j.PersonLastName, "personFamilyName"), v.a(j.PersonMiddleName, "personMiddleName"), v.a(j.PersonMiddleInitial, "personMiddleInitial"), v.a(j.PersonNamePrefix, "personNamePrefix"), v.a(j.PersonNameSuffix, "personNameSuffix"), v.a(j.PhoneNumber, "phoneNumber"), v.a(j.PhoneNumberDevice, "phoneNumberDevice"), v.a(j.PhoneCountryCode, "phoneCountryCode"), v.a(j.PhoneNumberNational, "phoneNational"), v.a(j.Gender, "gender"), v.a(j.BirthDateFull, "birthDateFull"), v.a(j.BirthDateDay, "birthDateDay"), v.a(j.BirthDateMonth, "birthDateMonth"), v.a(j.BirthDateYear, "birthDateYear"), v.a(j.SmsOtpCode, uYOhHhTXuF.ZbYcE));

    public static final String a(j jVar) {
        String str = (String) f5069a.get(jVar);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type");
    }
}
