/* Copyright 2014 the original author or authors.
 *
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
 */
package org.grails.plugins.codecs

import groovy.transform.CompileStatic
import org.grails.support.encoding.Encoder
import org.grails.support.encoding.CodecFactory
import org.grails.support.encoding.CodecIdentifier
import org.grails.support.encoding.Decoder

@CompileStatic
class HTMLCodecFactory implements CodecFactory {
    Encoder encoder = new HTMLEncoder()
    Decoder decoder = decoder = new HTML4Decoder() {
        @Override
        public CodecIdentifier getCodecIdentifier() {
            return HTMLEncoder.HTML_CODEC_IDENTIFIER;
        }
    } 
}