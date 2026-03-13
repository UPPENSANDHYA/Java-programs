class RBI {

    // Final method: cannot be overridden
    public final void kycRules() {
        System.out.println("Complete KYC as per RBI guidelines.");
    }
}

class HDFC_Bank extends RBI {

    // Cannot override final method from RBI
    // If we try to override kycRules(), it will cause a compile-time error
}

// Main class
public class RBIBank{

    public static void main(String[] args) {

        HDFC_Bank obj = new HDFC_Bank();

        // Calling final method from RBI
        obj.kycRules();
    }
}
