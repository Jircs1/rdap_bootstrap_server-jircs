/*
 * Copyright (C) 2013-2024 American Registry for Internet Numbers (ARIN)
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR
 * IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 *
 */
package net.arin.rdap_bootstrap.service;

import net.arin.rdap_bootstrap.service.DefaultBootstrap.Type;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static net.arin.rdap_bootstrap.service.TestConstants.ARIN_HTTP;
import static net.arin.rdap_bootstrap.service.TestConstants.ARIN_HTTPS;

public class DefaultBootstrapTest
{
    @Test
    public void testAllocations() throws Exception
    {
        DefaultBootstrap d = new DefaultBootstrap();
        d.loadData( new ResourceFiles() );

        assertEquals( ARIN_HTTP, d.getServiceUrls( Type.AUTNUM ).getHttpUrl() );
        assertEquals( ARIN_HTTPS, d.getServiceUrls( Type.DOMAIN ).getHttpsUrl() );
    }
}
