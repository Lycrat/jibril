package SuperheroPackage;

import ExceptionPackage.SpidermanSuitNonExistentException;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

public class SpidermanParameterResolver implements ParameterResolver {
    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return parameterContext.getParameter().getType() == Spiderman.class;
    }

    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        try {
            return new Spiderman("peter parker",
                    "spiderman",
                    "marvel",
                    "dollyo chagi",
                    "male",
                    true,
                    "black");
        } catch (SpidermanSuitNonExistentException e) {
            throw new RuntimeException(e);
        }
    }
}
