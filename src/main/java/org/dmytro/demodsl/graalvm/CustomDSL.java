//package org.dmytro.demodsl.graalvm;
//
//import com.oracle.truffle.api.TruffleLanguage;
//import com.oracle.truffle.api.frame.VirtualFrame;
//import org.graalvm.polyglot.*;
//import org.graalvm.truffle.api.*;
//
//@TruffleLanguage.Registration(id = "customDSL", name = "CustomDSL", version = "1.0")
//public class CustomDSL extends TruffleLanguage<CustomDSL.LanguageContext> {
//
//    @Override
//    protected LanguageContext createContext(Env env) {
//        return new LanguageContext(this);
//    }
//
//    @Override
//    protected Object eval(ParsingResult parsingResult, VirtualFrame frame) {
//        // Обробка основного контексту та виконання коду
//        return null;
//    }
//
//    public static class LanguageContext {
//        private final CustomDSL language;
//
//        public LanguageContext(CustomDSL language) {
//            this.language = language;
//        }
//    }
//}
