/*
 * #%L
 * Wildfly Camel
 * %%
 * Copyright (C) 2013 - 2015 RedHat
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package flipkart-cart_code-v1.0;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import org.apache.camel.impl.DefaultCamelContext;
import org.wildfly.extension.camel.CamelAware;

@CamelAware
@ApplicationScoped
@Named("camel-cdi-context")
public class MyCamelContext extends DefaultCamelContext {

}
