import React from 'react'

export default class App extends React.Component {
    render() {
        return (
            <div className="site-wrapper">
                <div className="site-wrapper-inner">
                    <div className="cover-container container">
                        <div className="row">
                            <div className="inner cover col-xs-12">
                                <h1 className="cover-heading">Welcome to "Voter" - service for creating surveys</h1>
                                <p className="lead">other text</p>
                            </div>
                        </div>

                       <div className="container">
                       { this.props.children }
                       </div>

                        <div className="mastfoot">
                            <div className="inner">
                                <p>Cover template for
                                    <a href="https://getbootstrap.com">Bootstrap</a>, by
                                    <a href="https://twitter.com/mdo">@mdo</a>.
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}