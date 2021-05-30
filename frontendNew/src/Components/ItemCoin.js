import React, { Component } from 'react';

class ItemCoin extends Component {
    render() {
        return (
            <>
                <a href="/vi/trade/BUSD_USDT" className="css-xsglxf">
                    <div style={{ width: '160px', flex: 160 }} className="css-10nf7hq">
                        <div className="lozad-load css-n9v9v lozad-loaded" alt="" data-src="/library/images/d.png" style={{ backgroundImage: 'url("/library/images/d.png")', backgroundRepeat: 'no-repeat', backgroundSize: '100%', backgroundPosition: 'center center' }} />
                        <div className="css-1q7503z">
                            <div data-bn-type="text" className="css-1sgz1lk">BUSD</div>
                            <div data-bn-type="text" className="css-1o2ukii">BUSD</div>
                        </div>
                    </div>
                    <div style={{ minWidth: '80px', flex: 80 }} className="css-10nf7hq">$0.999400</div>
                    <div style={{ minWidth: '80px', flex: 80 }} className="css-13mi9lc"><div data-bn-type="text" style={{ direction: 'ltr' }} className="css-g80xfv">+0.02%</div></div>
                    <div style={{ minWidth: '150px', flex: 150 }} className="css-1q869vv">
                        <div className="lozad-load css-d0rdh6 lozad-loaded" alt="" data-src="/library/images/BUSDUSDT.svg" style={{ backgroundImage: 'url("/library/images/BUSDUSDT.svg")', backgroundRepeat: 'no-repeat', backgroundSize: '100%', backgroundPosition: 'center center' }} />
                        <button data-bn-type="button" className="css-glbo8m">Mua</button>
                    </div>
                </a>
            </>
        );
    }
}

export default ItemCoin;