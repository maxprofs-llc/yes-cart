import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SharedModule } from '../shared/shared.module';
import { ServicesModule } from '../shared/services/services.module';

import { ContentRoutingModule } from './content-routing.module';
import { ContentComponent, ContentsComponent } from './components/index';
import { ShopContentComponent } from './index';

@NgModule({
    imports: [ContentRoutingModule, CommonModule, SharedModule, ServicesModule],
    declarations: [
      ContentComponent, ContentsComponent,
      ShopContentComponent
    ],
    exports: [
      ContentComponent, ContentsComponent,
      ShopContentComponent
    ]
})

export class ContentPagesModule { }
