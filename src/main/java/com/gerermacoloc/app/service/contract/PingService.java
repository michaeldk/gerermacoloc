package com.gerermacoloc.app.service.contract;

import com.gerermacoloc.app.domain.Ping;
import com.gerermacoloc.app.form.CreatePingForm;
import com.gerermacoloc.app.service.generic.GenericService;

public interface PingService extends
		GenericService<Ping, CreatePingForm> {
}
